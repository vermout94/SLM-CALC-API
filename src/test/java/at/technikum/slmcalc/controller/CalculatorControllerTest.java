package at.technikum.slmcalc.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorControllerTest {
    @Test
    void addTwoPositiveIntegers() {
        //Arrange
        CalculatorController calc = new CalculatorController();
        int a = 5;
        int b = 6;

        //Act
        int result = calc.add(a, b);

        //Assert
        assertEquals(5, result);
    }

    @Test
    void addOnePositiveAndOneNegativeInteger() {
        //Arrange
        CalculatorController calc = new CalculatorController();
        int a = 5;
        int b = -6;

        //Act
        int result = calc.add(a, b);

        //Assert
        assertEquals(-1, result);
    }

    @Test
    void addTwoNegativeIntegers() {
        //Arrange
        CalculatorController calc = new CalculatorController();
        int a = -5;
        int b = -6;

        //Act
        int result = calc.add(a, b);

        //Assert
        assertEquals(-11, result);
    }

}