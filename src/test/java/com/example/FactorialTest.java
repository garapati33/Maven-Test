package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FactorialTest {

    @Test
    public void testFactorial() {
        // Test input
        int n = 5;
        
        // Expected result
        int expectedResult = 120; // factorial of 5 is 5 * 4 * 3 * 2 * 1 = 120
        
        // Calculate factorial using Factorial class
        int actualResult = Factorial.calculateFactorial(n);
        
        // Assertion
        assertEquals(expectedResult, actualResult);
    }
}
