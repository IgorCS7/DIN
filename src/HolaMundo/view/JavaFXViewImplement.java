/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HolaMundo.view;

import javafx.application.Application;
import java.io.IOException;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author Igor
 */
public class JavaFXViewImplement extends Application implements View {
    
    private  String greeting;
   
     /**
     * recoge el greting y  ejecuta la aplicacion JavaFX para mostrar el mensaje 
     * @param greeting 
     */
    @Override
    public void showGreeting(String greeting) {
        //JavaFXViewImplement.greeting=greeting;
        launch(new String[0]);
    }
    
    @Override
    public void start(Stage stage) throws IOException {
       
            
            FXMLLoader loader=new FXMLLoader( getClass().getResource("FXMLDocument.fxml"));//cargamos el archivo FXMLDocument
            Parent root = loader.load();
            
            FXMLDocumentController Control=((FXMLDocumentController)loader.getController());//Obtenemos el FXMLcontroller 
           
            Control.setGreeting(greeting);//definimos el greeting para pasarselo al FXMLController
            
            Scene scene=new Scene(root);//Creamos la escena y definimos un documento para ello
            
            stage.setScene(scene);//definimos la escena en el escenario
            stage.show();//lo mostramos
            
      
    }
    /**
    *Inicializamos el metodo para JavaFX app.Stores greeting 
     * @throws java.lang.Exception
    */
    @Override
    public void init() throws Exception{
        this.greeting=getParameters().getRaw().get(0);
    }
    
   public void setGreeting(String greeting){
       this.greeting=greeting;
   }
    
}