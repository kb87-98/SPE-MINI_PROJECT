package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
    //This are test cases for SCientific Calculator App

    @Test
    public void testSquareRoot() {
        assertEquals(2.0, Operation.squareRoot(4), 0.001); // Test square root of 4
        assertEquals(3.0, Operation.squareRoot(9), 0.001); // Test square root of 9
        assertEquals(4.0, Operation.squareRoot(16), 0.001); // Test square root of 16
    }

    @Test
    public void testFactorial() {
        assertEquals(1, Operation.fact(0)); // Test factorial of 0
        assertEquals(1, Operation.fact(1)); // Test factorial of 1
        assertEquals(120, Operation.fact(5)); // Test factorial of 5
    }

    @Test
    public void testNaturalLog() {
        assertEquals(0.0, Operation.naturalLog(1), 0.001); // Test natural log of 1
        assertEquals(1.609, Operation.naturalLog(5), 0.001); // Test natural log of 5
        assertEquals(2.708, Operation.naturalLog(15), 0.001); // Test natural log of 15
    }

    @Test
    public void testPower() {
        assertEquals(8.0, Operation.power(2, 3), 0.001); // Test power of 2^3
        assertEquals(27.0, Operation.power(3, 3), 0.001); // Test power of 3^3
        assertEquals(1024.0, Operation.power(2, 10), 0.001); // Test power of 2^10
    }
}
