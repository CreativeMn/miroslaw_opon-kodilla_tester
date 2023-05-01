package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Bentley;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Ford("Focus", 120));
        cars.add(new Ford("Fiesta", 70));
        cars.add(new Ford("Mustang", 250));
        cars.add(new Ford("Smax", 80));
        cars.add(new Ford("Cmax", 90));
        cars.add(new Audi("RS3", 250));
        cars.add(new Audi("RS4", 280));
        cars.add(new Audi("RS6", 300));
        cars.add(new Bentley("Bentayga", 240));
        cars.add(new Bentley("Continental", 260));
        cars.add(new Bentley("Azure", 180 ));

        System.out.println(cars.size());

        cars.remove(1);
        System.out.println(cars.size());

        Ford carToRemove = new Ford();
        cars.remove(carToRemove);
        System.out.println(cars.size());

        for (Car car : cars) {
            if (car.getSpeed() > 200) {
                CarUtils.describeCar(car);
            }
        }
    }
}
