package edu.trinity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciCalculatorTest {
    @Test
    void testFibonacciEdgeCases() {
        FibonacciCalculator calculator = new FibonacciCalculator(0);
        assertEquals(0, calculator.calculate(0));
        calculator = new FibonacciCalculator(1);
        assertEquals(1, calculator.calculate(1));
    }

    @Test
    void testFibonacciNormalCases() {
        FibonacciCalculator calculator = new FibonacciCalculator(5);
        assertEquals(1, calculator.calculate(2));
        assertEquals(2, calculator.calculate(3));
        assertEquals(5, calculator.calculate(5));
    }

}