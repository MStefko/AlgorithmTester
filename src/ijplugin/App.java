/*
 * Copyright (C) 2017 Laboratory of Experimental Biophysics
 * Ecole Polytechnique Federale de Lausanne
 *
 * Author: Marcel Stefko
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ijplugin;

import algorithm_tester.AlgorithmTester;
import algorithm_tester.EvaluationAlgorithm;
import algorithm_tester.FeedbackController;
import algorithm_tester.ImageGenerator;
import ij.ImagePlus;
import ij.gui.GenericDialog;
import ij.gui.Plot;
import ij.process.ImageProcessor;
import java.awt.Color;
import java.awt.Font;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Backend for the FIJI plugin GUI
 * @author Marcel Stefko
 */
public class App extends AlgorithmTester {
    private final ImagePlus imp;
    private final Plot plot;
    private Worker worker;
    
    /**
     * Initialize simulation, generate 2 images for correct 
     * stack display, then display the stack
     * and plot of controller state.
     */
    public App() {
        super();
        generator.getNextImage();
        generator.getNextImage();
        imp = new ImagePlus("Sim window", generator.getStack());
        imp.show();
        plot = new Plot("Controller history", "Frame id.", "Value");
        plot.show();
        
    }
    
    public App(LinkedHashMap<String, EvaluationAlgorithm> analyzers,
            ImageGenerator generator, FeedbackController controller) {
        super(analyzers, generator, controller);
        generator.getNextImage();
        generator.getNextImage();
        imp = new ImagePlus("Sim window", generator.getStack());
        imp.show();
        plot = new Plot("Controller history", "Frame id.", "Value");
        plot.show();
    }
    
    /**
     * Start continuously generating new images until stopped.
     */
    public void startSimulating() {
        worker = new Worker(this, generator, controller, analyzers, imp);
        worker.start();
    }
    
    /**
     * Stop generating new images.
     */
    public void stopSimulating() {
        worker.stop = true;
        try {
            worker.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Set new setpoint for the controller
     * @param value new setpoint value
     */
    public void setSetpoint(double value) {
        controller.setTarget(value);
    }
    
    /**
     * Return the controller plot handle
     * @return plot with controller history
     */
    public Plot getPlot() {
        return plot;
    }
    
    /**
     * Automatically generates the setup frame for all active analyzers,
     * by looking at the key-value pairs of each analyzer's parameter map.
     */
    public void analyzerSetupDialog() {
        GenericDialog gd = new GenericDialog("Analyzer setup");
        for (String key: analyzers.keySet()) {
            System.out.println(analyzers.get(key).getName());
            gd.addMessage(String.format("%s:",key));
            LinkedHashMap<String,Integer> settings = analyzers.get(key).getCustomParameters();
            System.out.println(settings.keySet().isEmpty());
            for (String s_key: settings.keySet()) {
                gd.addNumericField(s_key, settings.get(s_key), 0);
            }
        }
        gd.showDialog();
        
        if (gd.wasCanceled())
            return;
        
        for (String key: analyzers.keySet()) {
            LinkedHashMap<String,Integer> settings = new LinkedHashMap<String,Integer>();
            for (String s_key: analyzers.get(key).getCustomParameters().keySet()) {
                settings.put(s_key, (int) gd.getNextNumber());
            }
            analyzers.get(key).setCustomParameters(settings);
        }
    }
    
    
    
}

class Worker extends Thread {
    public boolean stop;
    private final App app;
    private final ImageGenerator generator;
    private final FeedbackController controller;
    private final HashMap<String,EvaluationAlgorithm> analyzers;
    private final ImagePlus imp;
    
    public Worker(App app, ImageGenerator generator, FeedbackController controller, HashMap<String,EvaluationAlgorithm> analyzers, ImagePlus imp) {
        this.app = app;
        this.generator = generator;
        this.controller = controller;
        this.analyzers = analyzers;
        this.imp = imp;
        stop = false;
    }
    
    @Override
    public void run() {
        ImageProcessor ip;
        while (!stop) {
            app.incrementCounter();
            ip = generator.getNextImage();
            for (EvaluationAlgorithm analyzer: analyzers.values())
                analyzer.processImage(ip.duplicate());
            //System.out.println(image_count);
            controller.adjust();
            
            imp.setSlice(imp.getNSlices());
            imp.updateAndRepaintWindow();
            try {
                sleep(20);
            } catch (InterruptedException ex) {
                Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (app.getImageCount()%10==0) {
                updatePlot();
            }
        }
    }
    
    public void updatePlot() {
        Plot plot = app.getPlot();
        
        int count = app.getImageCount()-1;
        double[] x = new double[count]; 
        double[] real = new double[count];
        double[] laser = new double[count]; 
        double[] spot = new double[count];
        double[] set_point = new double[count];
        for (int i=1; i<=count; i++) {
            x[i-1] = (double) i;
            real[i-1] = generator.getTrueSignal(i);
            laser[i-1] = controller.getOutputHistory(i);
            spot[i-1] = controller.getAnalyzer().getErrorSignal(i);
            set_point[i-1] = controller.getSetpointHistory(i);
        }
        plot.setColor(Color.black);
        plot.addPoints(x, real, Plot.LINE);
        plot.setFont(new Font("Helvetica", Font.PLAIN, 14));
        plot.addLabel(0.02,0.1,"True signal");
        plot.setColor(Color.red);
        plot.addPoints(x, spot, Plot.LINE);
        plot.addLabel(0.02,0.2,"Measured signal");
        plot.setColor(Color.blue);
        plot.addPoints(x, set_point, Plot.LINE);
        plot.addLabel(0.02,0.3,"Setpoint");
        plot.setColor(Color.orange);
        plot.addPoints(x, laser, Plot.LINE);
        plot.addLabel(0.02,0.4,"Laser power");
        plot.setLimits(0, 0.5, 0, 0.5); // hack to get a correct rescale
        plot.setLimitsToFit(true);
        plot.draw();
        
    }
}