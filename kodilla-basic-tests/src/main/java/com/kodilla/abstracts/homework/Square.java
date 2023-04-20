package com.kodilla.abstracts.homework;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getSurface() {
        return side * side;
    }

    @Override
    public double getCircumference() {
        return side * 4;
    }
}
