/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HolaMundo.view;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * @author Igor
 */
public class FXMLDocumentController {
  
    @FXML
    private Label label;
    /**
     *objeto String que contiene el greting para mostrar el mensaje al pulsar el boton
     */
    private String greeting;//nombre del objeto

    public void setGreeting(String greeting){
        this.greeting=greeting;
    }
    /**
     * muestra el greeting usando el label
     *@param event
     */
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        label.setText(greeting);
    }
}