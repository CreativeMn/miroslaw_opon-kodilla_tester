package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;
    public OperatingSystem ( int year) {
        this.year = year;
    }
    public void turnOn() {
        System.out.println("System włączony.");
    }
    public void turnOff() {
        System.out.println("System wyłączony.");
    }

    public int getYear() {
        return year;
    }
}
