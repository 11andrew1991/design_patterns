package app.manyimplements.carimpl;

import app.manyimplements.cartype.enums.CarColor;
import app.manyimplements.cartype.enums.CarInteriorType;
import app.manyimplements.cartype.enums.CarType;

public class Car {

    private String engine;

    private int year;

    private CarInteriorType carInteriorType;

    private CarColor carColor;

    private CarType carType;

    public Car(CarType carType) {
        this.carType = carType;
    }

    public CarInteriorType getCarInteriorType() {
        return carInteriorType;
    }

    public void setCarInteriorType(CarInteriorType carInteriorType) {
        this.carInteriorType = carInteriorType;
    }

    public CarColor getCarColor() {
        return carColor;
    }

    public void setCarColor(CarColor carColor) {
        this.carColor = carColor;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("--------------" + carType + "----------------");
        stringBuilder.append("\n Exterior: ").append(carColor);
        stringBuilder.append("\n Interior: ").append(carInteriorType);
        stringBuilder.append("\n Year: ").append(year);
        stringBuilder.append("\n Engine: ").append(engine);

        return stringBuilder.toString();
    }

}
