package factory.shape.app;

import factory.shape.app.product.Circle;
import factory.shape.app.product.Rectangle;
import factory.shape.app.product.Shape;
import factory.shape.app.product.Square;

public class ShapeFactory {

    public static Shape createShape(String shapeType) {
        if ("CIRCLE".equalsIgnoreCase(shapeType)) {
            return new Circle();
        } else if ("RECTANGLE".equalsIgnoreCase(shapeType)) {
            return new Rectangle();
        } else if ("SQUARE".equalsIgnoreCase(shapeType)) {
            return new Square();
        }

        throw new RuntimeException();
    }
}
