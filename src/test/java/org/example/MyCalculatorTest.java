package org.example;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCalculatorTest {

    private MyCalculator myCalculator;

    // Al empezar cada test, este se ejecuta
    @BeforeEach
    void setUpMyCalculator() {
        myCalculator = new MyCalculator();
        System.out.println("MyCalculator created");
    }

    // Al acabar cada test, este se ejecuta
    @AfterEach
    void tearDownMyCalculator() {
        myCalculator = null;
        System.out.println("My calculator = null");
    }

    @Test
    void add() {
        //Declarando el resultado esperado
        int expectedResult = 10;

        //Declarando el resultado actual, donde se llama al método en cuestión para conseguir el resultado
        int actualResult = myCalculator.add(5, 5);

        //El test en sí, donde le pasamos las 2 variables anteriores
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void sub() {
        //Declarando el resultado esperado
        int expectedResult = 0;

        //Declarando el resultado actual, donde se llama al método en cuestión para conseguir el resultado
        int actualResult = myCalculator.sub(5, 5);

        //El test en sí, donde le pasamos las 2 variables anteriores
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void mult() {
        //Declarando el resultado esperado
        int expectedResult = 25;

        //Declarando el resultado actual, donde se llama al método en cuestión para conseguir el resultado
        int actualResult = myCalculator.mult(5, 5);

        //El test en sí, donde le pasamos las 2 variables anteriores
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void div() {
        //Declarando el resultado esperado
        int expectedResult = 5;

        //Declarando el resultado actual, donde se llama al método en cuestión para conseguir el resultado
        int actualResult = myCalculator.div(15, 3);

        //El test en sí, donde le pasamos las 2 variables anteriores
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divByZero() {
        //Declarando el resultado esperado
        int expectedResult = 5;

        //El test en sí, donde le pasamos las 2 variables anteriores
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> myCalculator.div(5, 0));
        assertEquals("Divisió por zero", exception.getMessage());
    }

    @Test
    @Disabled
    void addWhenNegativeThrowsException() {
        int expectedResult = 5;

        //El test en sí, donde le pasamos las 2 variables anteriores
        assertThrows(IllegalArgumentException.class, () -> myCalculator.add(5, -1));
    }

    @Test
    @Disabled
    void subWhenNegativeThrowsException() {
        int expectedResult = 5;

        //El test en sí, donde le pasamos las 2 variables anteriores
        assertThrows(IllegalArgumentException.class, () -> myCalculator.sub(5, -1));
    }

    @Test
    @Disabled
    void multWhenNegativeThrowsException() {
        int expectedResult = 5;

        //El test en sí, donde le pasamos las 2 variables anteriores
        assertThrows(IllegalArgumentException.class, () -> myCalculator.mult(5, -1));
    }

    @Test
    @Disabled
    void divWhenNegativeThrowsException() {
        int expectedResult = 5;

        //El test en sí, donde le pasamos las 2 variables anteriores
        assertThrows(IllegalArgumentException.class, () -> myCalculator.div(5, -1));
    }
}