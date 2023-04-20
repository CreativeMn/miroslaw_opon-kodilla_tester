package com.kodilla.abstracts.homework;

public class Circle extends Shape {
    public Circle() {
        super(30,40);
    }
    @Override
    public void surfaceArea() {
        System.out.println("Pole koła.");
    }
    @Override
    public void circumference() {
        System.out.println("Obwód koła.");
    }
}
