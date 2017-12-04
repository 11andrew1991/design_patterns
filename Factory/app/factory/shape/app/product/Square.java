package factory.shape.app.product;

/**
 * ConcreteProduct - Implements the Product interface.
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("SQUARE :: draw() method.");
    }

}
