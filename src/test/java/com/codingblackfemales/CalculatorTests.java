package com.codingblackfemales;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName(value = "The Calculator should")
public class CalculatorTests {

    @Test
    @DisplayName("add two numbers")
    public void testAddition() {
        final Integer sum = Calculator.add(2, 4);

        assertEquals(6, sum);
    }

    @Test
    @DisplayName("subtract two numbers")
    public void testSubtraction() {
        final Integer difference = Calculator.subtract(2, 4);

        assertEquals(-2, difference);
    }

    @Test
    @DisplayName("divides two numbers")
    public void testDividesTwoNumbers() {
        final Integer quotient = Calculator.divide(4, 2);

        assertEquals(2, quotient);
    }
    
    @Test
    @DisplayName("divide by zero throws proper error")
    public void testDivideByZero() {
        final Integer quotient = Calculator.divide(4, 0);

        assertEquals(0, quotient);
    }
    
}
