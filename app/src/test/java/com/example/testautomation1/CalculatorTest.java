package com.example.unittestingsample;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator(); // Initialize the Calculator object before each test
    }

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3)); // Test addition
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2)); // Test subtraction
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3)); // Test multiplication
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculator.divide(6, 3), 0.001); // Test division
    }

    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0)); // Test division by zero
    }
}

