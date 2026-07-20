package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AAATest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        System.out.println("Setup Method Executed");
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        System.out.println("Teardown Method Executed");
        calculator = null;
    }

    @Test
    void testAddUsingAAA() {

        // Arrange
        int a = 2;
        int b = 3;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(5, result);
    }
}