package car.decorator;

/**
 * Concrete Component - Defines an object to which additional responsibilities can be attached.
 */
public class BasicCar implements Car {

    @Override
    public void assemble() {
        System.out.print("Basic Car.");
    }
}
