package factory.shape.app;

import factory.shape.app.creator.CircleCreator;
import factory.shape.app.creator.RectangleCreator;
import factory.shape.app.creator.ShapeCreator;
import factory.shape.app.creator.SquareCreator;

public class Main {

    public static void main(String[] args) {
        ShapeCreator shapeCreator = new CircleCreator();
        shapeCreator.draw();

        shapeCreator = new RectangleCreator();
        shapeCreator.draw();

        shapeCreator = new SquareCreator();
        shapeCreator.draw();
    }
}
