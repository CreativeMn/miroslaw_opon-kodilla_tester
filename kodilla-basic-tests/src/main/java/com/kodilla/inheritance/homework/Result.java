package com.kodilla.inheritance.homework;

public class Result {
    public static void main (String [] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2000);
        operatingSystem.turnOn();
        operatingSystem.turnOff();

        Windows7 windows7 = new Windows7(2009);
        windows7.newTurnOn();
        windows7.newTurnOff();

        Windows11 windows11 = new Windows11(2021);
        windows11.theNewestOn();
        windows11.theNewestOff();
        System.out.println(operatingSystem.getYear());
        System.out.println(windows7.getYear());
        System.out.println(windows11.getYear());
    }
}
