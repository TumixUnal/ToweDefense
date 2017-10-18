/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JFrame;

/**
 *
 * @author Estudiante
 */
public class UIG  implements UI{

    @Override
    public void printWelcome() {
        JFrame frame = new JFrame("welcome");
        frame.setVisible(true);
    }

    @Override
    public void printMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
