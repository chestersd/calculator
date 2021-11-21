package com.epam.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddShouldAddWhenNumbersPositive(){
        //given
        Calculator calculator = new Calculator();

        //when
        int summ = calculator.add(1, 2);

        //then
        Assert.assertEquals(3, summ);
    }

    @Test
    public void testAddShouldAddWhenNumbersNegative(){
        //given
        Calculator calculator = new Calculator();

        //when
        int summ = calculator.add(-5, -3);

        //then
        Assert.assertEquals(-8, summ);
    }

    @Test
    public void testSubtractShouldSubtractWhenNumbersPositive(){
        //given
        Calculator calculator = new Calculator();

        //when
        int difference = calculator.subtract(7,5);

        //then
        Assert.assertEquals(2, difference);
    }

    @Test
    public void testSubtractShouldSubtractWhenNumbersNegative(){
        //given
        Calculator calculator = new Calculator();

        //when
        int difference = calculator.subtract(-7,-5);

        //then
        Assert.assertEquals(-2, difference);
    }

    @Test
    public void testMultiplyShouldMultiplyWhenNumbersInteger(){
        //given
        Calculator calculator = new Calculator();

        //when
        double product = calculator.multiply(7,5);

        //then
        Assert.assertEquals(35, product);
    }

    @Test
    public void testMultiplyShouldMultiplyWhenNumbersFraction(){
        //given
        Calculator calculator = new Calculator();

        //when
        double product = calculator.multiply(7.5, 3.9);

        //then
        Assert.assertEquals(35, product);
    }
}
