package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Square square = new Square();
        square.surfaceArea();
        square.circumference();

        Circle circle = new Circle();
        circle.surfaceArea();
        circle.circumference();

        Triangle triangle = new Triangle();
        triangle.surfaceArea();
        triangle.circumference();
    }
}
