package manyimplements.cartype;

import manyimplements.carimpl.Car;
import manyimplements.carimpl.CarBuilder;
import manyimplements.cartype.enums.CarColor;
import manyimplements.cartype.enums.CarInteriorType;
import manyimplements.cartype.enums.CarType;

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
