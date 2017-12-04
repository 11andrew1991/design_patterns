package factory.shape.app.product;

/**
 * ConcreteProduct - Implements the Product interface.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("RECTANGLE :: draw() method.");
    }

}
