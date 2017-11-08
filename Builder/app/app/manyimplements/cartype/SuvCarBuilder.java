package app.manyimplements.cartype;

import app.manyimplements.carimpl.Car;
import app.manyimplements.carimpl.CarBuilder;
import app.manyimplements.cartype.enums.CarColor;
import app.manyimplements.cartype.enums.CarInteriorType;
import app.manyimplements.cartype.enums.CarType;

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
