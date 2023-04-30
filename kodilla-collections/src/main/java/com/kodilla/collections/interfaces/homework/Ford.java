package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    public int speed;
    public String name;
    int increaser = 5;
    int decreaser = 3;

    public Ford() {
        this.speed = speed;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void getIncreaseSpeed() {
        speed = speed + increaser;
    }

    @Override
    public void getDecreaseSpeed() {
        speed = speed - decreaser;
    }
}
