package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Bentley;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("-------------------------");
        System.out.println("Car name: " + car.getName());
        System.out.println("Car speed: " + car.getSpeed());
    }
}
