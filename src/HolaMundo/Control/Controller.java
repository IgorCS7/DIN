package HolaMundo.Control;

import HolaMundo.model.Model;
import HolaMundo.view.View;

/**
 * @author Igor
 */
public class Controller {
 
    public void run(View view, Model model) {
        view.showGreeting(model.getGreeting());
    }
    
}