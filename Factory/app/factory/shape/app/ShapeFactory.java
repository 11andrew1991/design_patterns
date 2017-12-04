package factory.shape.app;

import factory.shape.app.product.Circle;
import factory.shape.app.product.Rectangle;
import factory.shape.app.product.Shape;
import factory.shape.app.product.Square;

public class ShapeFactory {

    public static Shape createShape(String shapeType) {
        switch (shapeType) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            default:
                throw new RuntimeException();
        }
    }
}
