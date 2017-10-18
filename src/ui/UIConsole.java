package ui;

import data.Animal;

/**
 *
 * @author Alejandro Velasco
 */
public class UIConsole extends Animal implements UI, Runnable{

    public UIConsole(String name, double price) {
        super(name, price);
    }

    @Override
    public void printWelcome() {
        System.out.println("Hola");
    }

    @Override
    public void printMenu() {
         System.out.println("Menu");
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void printInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
    
    
    
}
