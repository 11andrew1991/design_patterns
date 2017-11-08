package app.manyimplements;

import app.manyimplements.carimpl.Car;
import app.manyimplements.carimpl.CarBuilder;
import app.manyimplements.carimpl.CarDirector;
import app.manyimplements.cartype.SedanCarBuilder;
import app.manyimplements.cartype.SuvCarBuilder;

public class Main {

    public static void main(String[] args) {
        CarDirector carDirector = new CarDirector();

        CarBuilder sedanBuilder = new SedanCarBuilder();
        Car sedan = carDirector.createCar(sedanBuilder);
        System.out.println(sedan);

        CarBuilder suvBuilder = new SuvCarBuilder();
        Car suv = carDirector.createCar(suvBuilder);
        System.out.println(suv);
    }
}
