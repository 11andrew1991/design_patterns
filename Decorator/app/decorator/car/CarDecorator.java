package decorator.car;

/**
 * Decorator - Maintains a reference to a Component object and defines an interface that conforms to Component’s interface.
 */
public class CarDecorator implements Car {

    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}
