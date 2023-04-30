package com.kodilla.collections.interfaces.homework;

public class Bentley implements Car {
    public int speed;
    public String name;
    int increaser = 10;
    int decreaser = 5;

    public Bentley() {
        this.speed = speed;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSpeed() {
        return speed * 4;
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
