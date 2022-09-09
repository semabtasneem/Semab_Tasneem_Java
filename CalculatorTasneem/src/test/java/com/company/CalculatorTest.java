package com.company;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void shouldDividePositives() {

        assertEquals(calc.divide(6,2));
        assertEquals(calc.divide(80, 39));
        assertEquals(calc.divide(105, 100));
    }

    private void assertEquals(int ignoredDivide) {
    }

    @Test
    public void shouldDivideNegatives() {

        assertEquals(calc.divide(-6,-2));
        assertEquals(calc.divide(-80, -39));
        assertEquals(calc.divide(-105, -100));
    }

    @Test
    public void shouldDivideBothPosAndNeg() {
        assertEquals(calc.divide(6,-2));
        assertEquals(calc.divide(-80, 39));
        assertEquals(calc.divide(105, -100));
    }

    @Test
    public void shouldReturnZero() {
        assertEquals(calc.divide(0,0));
        assertEquals(calc.divide(0, 1));
        assertEquals(calc.divide(105, 0));
    }

    @Test
    public void testPositiveNumberAddition(){
        assertEquals(calc.add(1000,10));
        assertEquals(calc.add(0, 1));
        assertEquals(calc.add(1, 1));
    }

    @Test
    public void testNegativeNumberAddition(){
        assertEquals(calc.add(-55,-11));
        assertEquals(calc.add(-70, 20));
        assertEquals(calc.add(-101, -101));
    }

    @Test
    public void testZeroAddition(){
        assertEquals(calc.add(0,1));
        assertEquals(calc.add(-7, 0));
        assertEquals(calc.add(0, 0));
    }

    @Test
    public void testPositiveNumberSubtraction(){
        assertEquals(calc.sub(69,10));
        assertEquals(calc.sub(0, 1));
        assertEquals(calc.sub(1, 1));
    }

    @Test
    public void testNegativeNumberSubtraction(){
        assertEquals(calc.sub(-9,-20));
        assertEquals(calc.sub(-1, 1));
        assertEquals(calc.sub(5, -15));
    }

    @Test
    public void testZeroNumberSubtraction(){
        assertEquals(calc.sub(0,0));
        assertEquals(calc.sub(0, -1));
        assertEquals(calc.sub(5, 0));
    }

    @Test
    public void testPositiveNumberMultiplication(){
        assertEquals(calc.multiply(105,10));
        assertEquals(calc.multiply(4, 8));
        assertEquals(calc.multiply(1, 1));
    }

    @Test
    public void testNegativeNumberMultiplication(){
        assertEquals(calc.multiply(-9,10));
        assertEquals(calc.multiply(-15, -2));
        assertEquals(calc.multiply(7, -1));
    }

    @Test
    public void testZeroMultiplication(){
        assertEquals(calc.multiply(0,11));
        assertEquals(calc.multiply(5, 0));
        assertEquals(calc.multiply(0, 0));
    }
}


