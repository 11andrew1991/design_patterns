package abstractfactory.gui.elements.app.checkboxes;

/**
 * ConcreteProduct
 *
 * <ul>
 * <li>Defines a product object to be created by the corresponding concrete factory.</li>
 * <li>Implements the AbstractProduct interface.</li>
 * </ul>
 */
public class MacOSCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
