package com.kodilla.abstracts.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 12;
        int b = 7;
        int subtractResult = calculator.subtract(a, b);
        boolean correct = ResultChecker.assertEquals(5, subtractResult);
        if (correct) {
            System.out.println("Metoda odejmowania działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda odejmowania nie działa poprawnie dla liczb " + a + " i " + b);
        }
    }

    Calculator calculator = new Calculator();
    double pwrResult = calculator.pow(3,3);
    boolean good = ResultChecker.assertEquals(27, pwrResult);
        if (good) {
        System.out.println("Potęgowanie liczby 3 do potęgi trzeciej poprawnie wynosi:" + pwrResult);
    } else {
        System.out.println("Nieprawidłowe potęgowanie.");
    }
}
