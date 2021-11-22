package com.epam.calculator;

public class Calculator {

    public int add(int firstNumber, int secondNumber) {

        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {

        return firstNumber - secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {

        return firstNumber * secondNumber;
    }

    public double divide(int firstNumber, int secondNumber) {

         double firstNumberDouble = (double) firstNumber;
         double secondNumberDouble = (double) secondNumber;
         return firstNumberDouble / secondNumberDouble;

    }
}
