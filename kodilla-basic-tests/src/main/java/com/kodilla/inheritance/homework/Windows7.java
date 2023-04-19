package com.kodilla.inheritance.homework;

public class Windows7 extends OperatingSystem {


    public Windows7(int year) {
        super(year);
    }

    public void newTurnOn() {
        System.out.println("Nowy system włączony.");
    }

    public void newTurnOff() {
        System.out.println("Nowy system wyłączony.");
    }
}
