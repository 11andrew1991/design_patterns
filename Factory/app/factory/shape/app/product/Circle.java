package factory.shape.app.product;

/**
 * ConcreteProduct - Implements the Product interface.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("CIRCLE :: draw() method.");
    }

}
