package com.codingblackfemales;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

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

    // Multiplication Test Cases
    // Multiply by 1
    // Multiply by 0
    // Two different numbers

    @Test
    @DisplayName("Multiplying value by 1")
    public void testMultiplicationByValueOne() {
        final Integer product = Calculator.multiply(1, 2);
        assertEquals(2, product);
    }

    @Test
    @DisplayName("Multiplying value by 0")
    public void testMultiplicationByValueZero() {
        final Integer product = Calculator.multiply(0, 94);
        assertEquals(0, product);
    }

    @Test
    @DisplayName("Multiplying two different values")
    public void testMultiplication() {
        final Integer product = Calculator.multiply(19, 4);
        assertEquals(76, product);
    }

// Highest value: 2147483647
//    @Test
//    @DisplayName("Multiplying value to achieve above integer limit")
//    public void testMultiplicationExceedIntegerLimit() {
//        final BigInteger product = (BigInteger) Calculator.multiply(50000, 50000);
//        assertEquals(2500000000, product);
//    }
//
}
