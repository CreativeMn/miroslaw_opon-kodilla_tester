package com.kodilla.abstracts.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);

        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int subtractResult = calculator.subtract(b, a);
        boolean good = ResultChecker.assertEquals (3, subtractResult);
        if (good) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + b + " i " + a);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + b + " i " + a);
        }

        int squareResult = calculator.square(a);
        boolean ok = ResultChecker.assertEquals(25, squareResult);
        if (ok) {
            System.out.println("Metoda square działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda square nie działa poprawnie dla liczby " + a);
        }
    }

}