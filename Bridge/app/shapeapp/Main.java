package shapeapp;

import shapeapp.Implementorimpl.GreenColor;
import shapeapp.Implementorimpl.RedColor;
import shapeapp.abstractionimpl.Pentagon;
import shapeapp.abstractionimpl.Shape;
import shapeapp.abstractionimpl.Triangle;

public class Main {

    public static void main(String[] args) {
        Shape triangle = new Triangle(new RedColor());
        triangle.applyColor();

        Shape pentagon = new Pentagon(new GreenColor());
        pentagon.applyColor();
    }
}
