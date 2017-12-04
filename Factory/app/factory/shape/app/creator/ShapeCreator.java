package factory.shape.app.creator;

import factory.shape.app.product.Shape;

/**
 * Creator - Declares the factory method, which returns an object of type Product.
 */
public abstract class ShapeCreator {

    public void draw() {
        Shape shape = getShape();
        shape.draw();
    }

    public abstract Shape getShape();
}
