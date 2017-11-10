package carapp.cartype;

import carapp.carimpl.Car;
import carapp.carimpl.CarBuilder;
import carapp.cartype.enums.CarColor;
import carapp.cartype.enums.CarInteriorType;
import carapp.cartype.enums.CarType;

public class SedanCarBuilder implements CarBuilder {

    private final Car car = new Car(CarType.SEDAN);

    public void buildInteriorStyle() {
        car.setCarInteriorType(CarInteriorType.FULL_LEATHER);
    }

    public void buildExteriorStyle() {
        car.setCarColor(CarColor.WHITE);
    }

    public void buildEngine() {
        car.setEngine("3.0 L");
    }

    public void buildYear() {
        car.setYear(2018);
    }

    public Car getCar() {
        return car;
    }
}
