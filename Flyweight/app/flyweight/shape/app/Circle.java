package flyweight.shape.app;

/**
 * ConcreteFlyweight - Implements the Flyweight interface and adds storage for intrinsic state, if any.
 * A ConcreteFlyweight object must be sharable.
 * Any state it stores must be intrinsic; that is, it must be independent of the ConcreteFlyweight object’s context.
 */
public class Circle implements Shape {

    private String color;

    private int x;

    private int y;

    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        StringBuilder result = new StringBuilder("Circle: Draw()")
                .append("[Color : ").append(color).append(", ")
                .append("x : ").append(x).append(", ")
                .append("y : ").append(y).append(", ")
                .append("radius : ").append(radius).append("]");
        System.out.println(result.toString());
    }
}
