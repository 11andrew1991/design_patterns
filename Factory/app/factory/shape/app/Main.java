package factory.shape.app;

import factory.shape.app.creator.CircleCreator;
import factory.shape.app.creator.RectangleCreator;
import factory.shape.app.creator.ShapeCreator;
import factory.shape.app.creator.SquareCreator;
import factory.shape.app.product.Shape;

public class Main {

    public static void main(String[] args) {
        // Simple factory pattern
        Shape shape = ShapeFactory.createShape("CIRCLE");
        shape.draw();

        shape = ShapeFactory.createShape("SQUARE");
        shape.draw();

        shape = ShapeFactory.createShape("RECTANGLE");
        shape.draw();

        System.out.println("---------------------------------------------------------");

        // Factory method
        ShapeCreator shapeCreator = new CircleCreator();
        shapeCreator.draw();

        shapeCreator = new RectangleCreator();
        shapeCreator.draw();

        shapeCreator = new SquareCreator();
        shapeCreator.draw();
    }
}
