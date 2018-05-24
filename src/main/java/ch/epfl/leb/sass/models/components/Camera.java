/*
 * Copyright (C) 2017-2018 Laboratory of Experimental Biophysics
 * Ecole Polytechnique Federale de Lausanne
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
package ch.epfl.leb.sass.models.components;

import ch.epfl.leb.sass.models.Model;

/**
 * Common methods of the Camera interface.
 * 
 * @author Kyle M. Douglass
 */
public interface Camera extends Model {
    
    /**
     * The number analog-to-digital units generated by each electron.
     * 
     * @return The number analog-to-digital units (ADUs) generated by each electron.
     */
    public double getAduPerElectron();
    
    /**
     * The offset added to each pixel in analog-to-digital units (ADUs).
     * 
     * @return The offset added to each pixel in analog-to-digital units (ADUs).
     */
    public int getBaseline();
    
    /**
     * The camera's dark current in electrons/second/pixel.
     * 
     * @return The camera's dark current in electrons/second/pixel.
     */
    public double getDarkCurrent();
    
    /**
     * The electron-multiplication gain.
     * 
     * This will be zero if there is no EM gain of the camera.
     * 
     * @return The electron-multiplication gain.
     */
    public int getEmGain();
    
    /**
     * The physical size of a pixel.
     * 
     * This is the image space, NOT object space, pixel size, i.e. it does not
     * depend on the optics.
     * 
     * @return The physical size of a pixel.
     */
    public double getPixelSize();
    
    /**
     * The camera's quantum efficiency.
     * 
     * This number determines how many photons are converted into electrons on
     * average per pixel.
     * 
     * @return The camera's quantum efficiency.
     */
    public double getQuantumEfficiency();
    
    /**
     * The readout noise per pixel in units of electrons (standard deviation).
     * 
     * @return The readout nosie per pixel.
     */
    public double getReadoutNoise();
    
    /**
     * The camera's thermal noise units of electrons/frame/pixel.
     * 
     * @return The camera's thermal noise.
     */
    public double getThermalNoise();
    
    /**
     * @return The number of pixels in x.
     */
    public int getNX();
    
    /**
     * @return The number of pixels in y.
     */
    public int getNY();
    
}
