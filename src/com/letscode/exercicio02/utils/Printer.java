package com.letscode.exercicio02.utils;

import com.letscode.exercicio02.service.TimesTables;

import java.util.Arrays;

public class Printer {

    final static String MESSAGE_ENTER_NUMBER = "Enter a number: ";

    public static void printMessageEnterNumber() {
        System.out.print(MESSAGE_ENTER_NUMBER);
    }

    public static void printTimesTablesResult(int number) {
        System.out.println(Arrays.toString(TimesTables.timesTables(number)));
    }
}
