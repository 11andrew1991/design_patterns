package abstractfactory.gui.elements.app.buttons;

/**
 * ConcreteProduct
 *
 * <ul>
 * <li>Defines a product object to be created by the corresponding concrete factory.</li>
 * <li>Implements the AbstractProduct interface.</li>
 * </ul>
 */
public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
