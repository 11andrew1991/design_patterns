package carapp;

import carapp.carimpl.Car;
import carapp.carimpl.CarBuilder;
import carapp.carimpl.CarDirector;
import carapp.cartype.SedanCarBuilder;
import carapp.cartype.SuvCarBuilder;

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
