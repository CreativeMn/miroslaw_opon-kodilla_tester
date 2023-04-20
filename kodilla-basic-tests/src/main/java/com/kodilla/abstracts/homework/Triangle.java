package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    public Triangle() {
        super(40,50);
    }
    @Override
    public void surfaceArea() {
        System.out.println("Pole trójkąta.");
    }
    @Override
    public void circumference() {
        System.out.println("Obwód trójkąta.");
    }
}
