package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Shape square = new Square(5);
        System.out.println("Pole kwadratu o boku 5 wynosi: " + square.getSurface());
        System.out.println("Obwód kwadratu o boku 5 wynosi: " + square.getCircumference());

        Shape triangle = new Triangle(4, 5, 6, 5);
        System.out.println("Trójkąt o podstawie: 4, bokach: 5,6 i wysokości: 5 ma pole powierzchni: " + triangle.getSurface());
        System.out.println("Trójkąt o podstawie: 4, bokach: 5,6 i wysokości: 5 ma obwód: " + triangle.getCircumference());

        Shape circle = new Circle(5);
        System.out.println("Koło o promieniu 5 ma powierzchnię: " + circle.getSurface());
        System.out.println("Koło o promieniu 5 ma obwód: " + circle.getCircumference());

    }
}

