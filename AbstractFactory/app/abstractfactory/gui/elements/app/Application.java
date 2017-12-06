package abstractfactory.gui.elements.app;

import abstractfactory.gui.elements.app.buttons.Button;
import abstractfactory.gui.elements.app.checkboxes.Checkbox;
import abstractfactory.gui.elements.app.factories.GUIFactory;

/**
 * Client - Uses only interfaces declared by AbstractFactory and AbstractProduct classes.
 */
public class Application {

    private Button button;

    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
