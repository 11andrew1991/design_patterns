package abstractfactory.gui.elements.app.factories;

import abstractfactory.gui.elements.app.buttons.Button;
import abstractfactory.gui.elements.app.buttons.MacOSButton;
import abstractfactory.gui.elements.app.checkboxes.Checkbox;
import abstractfactory.gui.elements.app.checkboxes.MacOSCheckbox;

/**
 * ConcreteFactory - Implements the operations to create concrete product objects.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
