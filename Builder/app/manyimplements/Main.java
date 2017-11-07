package manyimplements;

import manyimplements.carimpl.Car;
import manyimplements.carimpl.CarBuilder;
import manyimplements.carimpl.CarDirector;
import manyimplements.cartype.SedanCarBuilder;
import manyimplements.cartype.SuvCarBuilder;

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
