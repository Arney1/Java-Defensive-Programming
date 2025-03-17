package com.mycompany.app;

// ****************************************************************
// MathUtils.java
//
// Provides static mathematical utility functions.
//
// ****************************************************************
public class Case3MathUtils {

    //-------------------------------------------------------------
    // Returns the factorial of the argument given
    //-------------------------------------------------------------
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(
                "Factorial is not defined for negative numbers: " + n
            );
        }
        if (n > 16) {
            throw new IllegalArgumentException(
                "Factorial result exceeds maximum allowed value for n > 16: " +
                n
            );
        }
        int fac = 1;
        for (int i = n; i > 0; i--) fac *= i;
        return fac;
    }
}
