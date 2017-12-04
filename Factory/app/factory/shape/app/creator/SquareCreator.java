package factory.shape.app.creator;

import factory.shape.app.product.Shape;
import factory.shape.app.product.Square;

/**
 * ConcreteCreator - Overrides the factory method to return an instance of a ConcreteProduct.
 */
public class SquareCreator extends ShapeCreator {

    @Override
    public Shape getShape() {
        return new Square();
    }

}
