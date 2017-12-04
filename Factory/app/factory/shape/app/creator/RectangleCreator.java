package factory.shape.app.creator;

import factory.shape.app.product.Rectangle;
import factory.shape.app.product.Shape;

/**
 * ConcreteCreator - Overrides the factory method to return an instance of a ConcreteProduct.
 */
public class RectangleCreator extends ShapeCreator {

    @Override
    public Shape getShape() {
        return new Rectangle();
    }

}
