package abstractfactory.gui.elements.app.factories;

import abstractfactory.gui.elements.app.buttons.Button;
import abstractfactory.gui.elements.app.buttons.WindowsButton;
import abstractfactory.gui.elements.app.checkboxes.Checkbox;
import abstractfactory.gui.elements.app.checkboxes.WindowsCheckbox;

/**
 * ConcreteFactory - Implements the operations to create concrete product objects.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
