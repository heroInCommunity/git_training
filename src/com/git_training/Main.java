package com.git_training;

public class Main {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        System.out.println("This is add method");
        System.out.println("This is add method");
        return a + b;
    }

    public double add(double a, double b, double c) {
        System.out.println("This is add method for 3 parameters");
        return a + b + c;
    }

    public double add(double a, double b, double c, double d) {
        System.out.println("This is add method for 4 parameters");
        return a + b + c + d;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            return a;
        }
    }

    public int mult(int a, int b) {
        return a * b;
    }

    public double sqrt(double a) {
        return Math.sqrt(a);
    }
}
