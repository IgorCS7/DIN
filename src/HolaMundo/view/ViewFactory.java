/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HolaMundo.view;

/**
 * View factory  que provee un metodo para conseguir la viewImplement 
 * @author Igor
 */
public class ViewFactory {
    
    public static View getView(){
       
        return new JavaFXViewImplement();
    }
    
}
