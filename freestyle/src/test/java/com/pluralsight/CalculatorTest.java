package com.pluralsight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAddIntegers() {
        // Arrange
        int i = 2;
        int j = 3;

        Calculator calculator = new Calculator();
        int expected = 5;

        // Act
        int actual = calculator.add(i, j);

        // Assert
        assertEquals(expected, actual);
//        Assertions.assertTrue(expected == actual);
    }

    @Test
    void testAdd() {

    }
}