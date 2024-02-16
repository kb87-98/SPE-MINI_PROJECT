package com.example;

public class Operation {

    // Factorial function
    public static int fact(int n) {
        if (n == 0)
            return 1;
        else
            return n * fact(n - 1);
    }

    // Square root function
    public static double squareRoot(double num1) {
        return Math.sqrt(num1);
    }

    // Natural logarithm function
    public static double naturalLog(double num3) {
        return Math.log(num3);
    }

    // Power function
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
