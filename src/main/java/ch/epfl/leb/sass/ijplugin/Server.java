/*
 * Copyright (C) 2017-2018 Laboratory of Experimental Biophysics
 * Ecole Polytechnique Fédérale de Lausanne
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
package ch.epfl.leb.sass.ijplugin;

import ch.epfl.leb.sass.server.RPCServer;

import ij.IJ;
import ij.plugin.frame.PlugInFrame;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * The form for configuring the SASS server from within ImageJ.
 * 
 * @author Kyle M. Douglass
 */
public class Server extends PlugInFrame {
    
    /**
     * The model to for the server form.
     */
    private ServerModel model = new ServerModel();
    
    /**
     * Creates new form Server
     * 
     * @param title The title of the form.
     */
    public Server(String title) {
        super(title);
        initComponents();
        setVisible(true);
        updateView();
    }
    
    /**
     * Creates new form Server
     */
    public Server() {
        super("SASS Server Control");
        initComponents();
        setVisible(true);
        updateView();
    }
    
    /**
     * Show the frame and initialize backend.
     * @param arg
     */
    @Override
    public void run(String arg) {
        
    }

    /**
     * Updates this form with the data from the model.
     */
    private void updateView() {
        textPort.setText(String.valueOf(model.getPort()));
        labelConfigFileSelection.setText(model.getConfigFile());
        buttonStart.setEnabled(model.getStartButtonEnabled());
        buttonStop.setEnabled(model.getStopButtonEnabled());
        buttonSelectConfigFile.setEnabled(model.getSelectConfigButtonEnabled());
        textPort.setEnabled(model.getPortTextEnabled());
    }
    
    /**
     * Updates the model for this form.
     */
    private void updateModel() {
        try {
            model.setPort(Integer.valueOf(textPort.getText()));
        } catch (NumberFormatException ex) {
            IJ.showMessage("Error in parsing of numerical values.");
        } catch (Exception ex) {
            IJ.showMessage("Error in device component intialization.");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelPort = new javax.swing.JLabel();
        textPort = new javax.swing.JTextField();
        labelConfigFile = new javax.swing.JLabel();
        labelConfigFileSelection = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        buttonStart = new javax.swing.JButton();
        buttonStop = new javax.swing.JButton();
        buttonSelectConfigFile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelCurrentStatus = new javax.swing.JLabel();

        setBackground(new java.awt.Color(238, 238, 238));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        labelPort.setText("Port");
        labelPort.setToolTipText("The server will listen on this network port.");

        textPort.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textPort.setText("9090");
        textPort.setToolTipText("The server will listen on this network port.");

        labelConfigFile.setText("Configuration file");
        labelConfigFile.setToolTipText("Select a file containing the simulation configuration by clicking \"Select configuration...\"");

        labelConfigFileSelection.setText("Choose a file...");
        labelConfigFileSelection.setToolTipText("");

        buttonStart.setText("Start");
        buttonStart.setEnabled(false);
        buttonStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStartActionPerformed(evt);
            }
        });

        buttonStop.setText("Stop");
        buttonStop.setEnabled(false);
        buttonStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStopActionPerformed(evt);
            }
        });

        buttonSelectConfigFile.setText("Select configuration...");
        buttonSelectConfigFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSelectConfigFileActionPerformed(evt);
            }
        });

        jLabel1.setText("Status");

        labelCurrentStatus.setText("Server stopped");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonStart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonStop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSelectConfigFile))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelConfigFile, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelPort, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelConfigFileSelection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textPort, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(labelCurrentStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPort)
                    .addComponent(textPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelConfigFile)
                    .addComponent(labelConfigFileSelection))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(labelCurrentStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonStart)
                    .addComponent(buttonStop)
                    .addComponent(buttonSelectConfigFile))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        try {
            // Ensure the server is shutdown
            model.getServer().stop();
        } catch (NullPointerException ex) {
            // ignore; model was never set
        } catch (InterruptedException ex) {
            // don't really care about this one
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_exitForm

    private void buttonSelectConfigFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSelectConfigFileActionPerformed
        JFileChooser fc = new JFileChooser();
        int returnVal;
        fc.setDialogType(JFileChooser.OPEN_DIALOG);
        //set a default filename
        fc.setSelectedFile(new File("simulation.sass"));
        //Set an extension filter
        fc.setFileFilter(new FileNameExtensionFilter("SASS settings","sass"));
        returnVal = fc.showOpenDialog(null);
        if  (returnVal != JFileChooser.APPROVE_OPTION) {
            return;
        }
        
        FileInputStream fileIn = null;
        try {
            fileIn = new FileInputStream(fc.getSelectedFile());
            model.setSimulationModel(IJPluginModel.read(fileIn));
            model.setConfigFile(fc.getSelectedFile().getName());
            model.setStartButtonEnabled(true);
            
            updateView();
            
        } catch (IOException ex) {
            model.setStartButtonEnabled(false);
            ex.printStackTrace();
        } finally {
            if (fileIn != null) {
                try {
                    fileIn.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_buttonSelectConfigFileActionPerformed

    private void buttonStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonStartActionPerformed
        updateModel();
        try {
            // Creates a new server AND simulation.
            RPCServer server = new RPCServer(
                    model.getSimulationModel(),
                    model.getPort()
            );
            model.setServer(server);

            Runnable serverThread = new Runnable() {
                public void run() {
                    System.out.println(
                            "Starting server on port " 
                                    + String.valueOf(model.getPort() + "...")
                    );
                    model.getServer().serve();
                }
            };
            new Thread(serverThread).start();
            
            // Update the GUI
            model.setStartButtonEnabled(false);
            model.setStopButtonEnabled(true);
            model.setSelectConfigButtonEnabled(false);
            model.setPortTextEnabled(false);
            
            // Allows the server to startup before checking its status.
            while ( !model.getServer().isServing() ) {
                Thread.sleep(500);
            }
            
            // Synchronizes the status label with the server
            Runnable statusThread = new Runnable() {
                public void run() {
                    labelCurrentStatus.setText("Server running");
                    
                    while ( model.getServer().isServing() )
                    {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            break;    
                        }
                    }
                    
                    labelCurrentStatus.setText("Server stopped " );
                }
            };
            new Thread(statusThread).start();
            
            System.out.println("Server has started.");
            
        } catch (Exception ex) {
            // Revert GUI model data
            model.setStartButtonEnabled(true);
            model.setStopButtonEnabled(false);
            model.setSelectConfigButtonEnabled(true);
            model.setPortTextEnabled(true);
            ex.printStackTrace();
            
        } finally {
            updateView();
            
        }
        
    }//GEN-LAST:event_buttonStartActionPerformed

    private void buttonStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonStopActionPerformed
        try {
            model.getServer().stop();
        } catch (InterruptedException ex) {
        }
        model.setStartButtonEnabled(true);
        model.setStopButtonEnabled(false);
        model.setSelectConfigButtonEnabled(true);
        model.setPortTextEnabled(true);
        updateView();
    }//GEN-LAST:event_buttonStopActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSelectConfigFile;
    private javax.swing.JButton buttonStart;
    private javax.swing.JButton buttonStop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelConfigFile;
    private javax.swing.JLabel labelConfigFileSelection;
    private javax.swing.JLabel labelCurrentStatus;
    private javax.swing.JLabel labelPort;
    private javax.swing.JTextField textPort;
    // End of variables declaration//GEN-END:variables
}
