package app.manyimplements.cartype;

import app.manyimplements.carimpl.Car;
import app.manyimplements.carimpl.CarBuilder;
import app.manyimplements.cartype.enums.CarColor;
import app.manyimplements.cartype.enums.CarInteriorType;
import app.manyimplements.cartype.enums.CarType;

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
