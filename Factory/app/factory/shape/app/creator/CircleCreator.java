package factory.shape.app.creator;

import factory.shape.app.product.Circle;
import factory.shape.app.product.Shape;

/**
 * ConcreteCreator - Overrides the factory method to return an instance of a ConcreteProduct.
 */
public class CircleCreator extends ShapeCreator {

    @Override
    public Shape getShape() {
        return new Circle();
    }

}
