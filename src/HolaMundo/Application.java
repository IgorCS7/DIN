/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HolaMundo;

import HolaMundo.Control.Controller;
import HolaMundo.model.ModelFactory;
import HolaMundo.view.ViewFactory;

/**
 * @author Igor
 */
public class Application {
    
    public static void main(String[] args) {
        new Controller().run(ViewFactory.getView(),ModelFactory.getModel());
    }
    
}