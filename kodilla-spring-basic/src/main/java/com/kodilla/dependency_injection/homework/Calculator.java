package com.kodilla.dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    private Display display;

    public Calculator(Display display) {
        this.display = display;
    }
    public double add(double a, double b) {
        double sum = a + b;
        this.display.display(sum);
        return sum;
    }

    public double subtract(double a, double b) {
        double sub = a - b;
        this.display.display(sub);
        return sub;
    }

    public double multiply(double a, double b) {
        double mul = a * b;
        this.display.display(mul);
        return mul;
    }

    public double divide(double a, double b) throws ZeroUsageException {
        if(a == 0 || b == 0) {
            throw new ZeroUsageException();
        } else {
            double result = a / b;
            display.display(result);
            return result;
        }
    }
}
