package abstractfactory.gui.elements.app.factories;

import abstractfactory.gui.elements.app.buttons.Button;
import abstractfactory.gui.elements.app.checkboxes.Checkbox;

/**
 * AbstractFactory - Declares an interface for operations that create abstract product objects.
 */
public interface GUIFactory {

    Button createButton();

    Checkbox createCheckbox();
}
