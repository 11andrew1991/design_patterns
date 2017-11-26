package shapeapp.abstractionimpl;

import shapeapp.Implementorimpl.Color;

/**
 * Refined Abstraction
 */
public class Pentagon extends Shape {

    public Pentagon(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.print("Pentagon filled with color ");
        color.applyColor();
    }
}
