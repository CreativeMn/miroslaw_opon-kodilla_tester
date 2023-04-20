package com.kodilla.abstracts.homework;

public class Square extends Shape {
    public Square() {
        super(20,30);
    }

    @Override
    public void surfaceArea() {
        System.out.println("Powierzchnia kwadratu.");
    }
    @Override
    public void circumference() {
        System.out.println("Obwód kwadratu.");
    }
}
