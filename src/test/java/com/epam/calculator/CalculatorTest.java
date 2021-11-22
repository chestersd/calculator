package com.epam.calculator;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

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
    public void testMultiplyShouldMultiplyWhenNumbersPositive(){
        //given
        Calculator calculator = new Calculator();

        //when
        int product = calculator.multiply(7,5);

        //then
        Assert.assertEquals(35, product);
    }

    @Test
    public void testMultiplyShouldMultiplyWhenNumbersNegative(){
        //given
        Calculator calculator = new Calculator();

        int product = calculator.multiply(-7,-5);

        //then
        Assert.assertEquals(35, product);
    }

    @Test
    public void testMultiplyShouldMultiplyWhenOneNumberNegative(){
        //given
        Calculator calculator = new Calculator();

        int product = calculator.multiply(-8,5);

        //then
        Assert.assertEquals(-40, product);
    }

    @Test
    public void testDivideShouldDivideWhenNumbersPositive(){
        //given
        Calculator calculator = new Calculator();

        double quotient = (double)calculator.divide(6, 5);

        //then
        Assert.assertEquals(1.2, quotient, 1e-3);
    }
}
