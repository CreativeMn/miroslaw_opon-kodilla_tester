package com.kodilla.abstracts.homework;

public class Circle extends Shape {
    public Circle() {
        super(40,50);
    }
    @Override
    public void surfaceArea() {
        System.out.println("Pole koła to: " + getSurfaceArea());
    }
    @Override
    public void circumference() {
        System.out.println("Obwód koła to: " + getCircumference());
    }
}
