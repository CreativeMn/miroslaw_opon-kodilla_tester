package com.kodilla.collections.interfaces.homework;

import java.util.Random;
public class CarRace {
    public static void doRace(Car car) {
        car.getIncreaseSpeed();
        car.getIncreaseSpeed();
        car.getIncreaseSpeed();
        car.getDecreaseSpeed();
        car.getDecreaseSpeed();

        System.out.println(car.getName() + ": " + car.getSpeed());
    }
    public static void main(String[] args) {
        Audi audi = new Audi();
        audi.name = "Audi A6";
        doRace(audi);

        Ford ford = new Ford();
        ford.name = "Ford Focus";
        doRace(ford);

        Bentley bentley = new Bentley();
        bentley.name = "Bentley Bentayga";
        doRace(bentley);
    }
}
