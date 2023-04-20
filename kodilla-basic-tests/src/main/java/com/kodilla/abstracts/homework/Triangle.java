package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    public Triangle() {
        super(60,70);
    }
    @Override
    public void surfaceArea() {
        System.out.println("Pole trójkąta to: " + getSurfaceArea());
    }
    @Override
    public void circumference() {
        System.out.println("Obwód trójkąta to: " + getCircumference());
    }
}
