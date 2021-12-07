package com.letscode.exercicio01.utils;

import com.letscode.exercicio01.service.Calculator;

public class Printer {

    final static String MESSAGE_ENTER_FIRST_NUMBER = "Enter the first number: ";
    final static String MESSAGE_ENTER_SECOND_NUMBER = "Enter the second number: ";

    public static void printMessageFirstNumber() {
        System.out.print(MESSAGE_ENTER_FIRST_NUMBER);
    }

    public static void printMessageSecondNumber() {
        System.out.print(MESSAGE_ENTER_SECOND_NUMBER);
    }

    public static void printSumResult(double firstNumber, double secondNumber) {
        System.out.printf("%.1f + %.1f = %.1f %n", firstNumber, secondNumber,
                Calculator.sum(firstNumber, secondNumber));
    }

    public static void printMinusResult(double firstNumber, double secondNumber) {
        System.out.printf("%.1f - %.1f = %.1f %n", firstNumber, secondNumber,
                Calculator.minus(firstNumber, secondNumber));
    }

    public static void printTimesResult(double firstNumber, double secondNumber) {
        System.out.printf("%.1f * %.1f = %.1f %n", firstNumber, secondNumber,
                Calculator.times(firstNumber, secondNumber));
    }

    public static void printDivisionResult(double firstNumber, double secondNumber) {
        System.out.printf("%.1f / %.1f = %.1f %n", firstNumber, secondNumber,
                Calculator.division(firstNumber, secondNumber));
    }

}
