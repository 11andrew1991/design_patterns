package carapp.cartype;

import carapp.carimpl.Car;
import carapp.carimpl.CarBuilder;
import carapp.cartype.enums.CarColor;
import carapp.cartype.enums.CarInteriorType;
import carapp.cartype.enums.CarType;

public class SuvCarBuilder implements CarBuilder {

    private final Car car = new Car(CarType.SUV);

    public void buildInteriorStyle() {
        car.setCarInteriorType(CarInteriorType.CLOTH);
    }

    public void buildExteriorStyle() {
        car.setCarColor(CarColor.BLACK);
    }

    public void buildYear() {
        car.setYear(2019);
    }

    public void buildEngine() {
        car.setEngine("5.0 L");
    }

    public Car getCar() {
        return car;
    }
}
