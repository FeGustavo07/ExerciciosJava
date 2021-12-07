package com.letscode.exercicio04.utils;

import java.util.Scanner;

public class Reader {

    public static Scanner input = new Scanner(System.in);

    public static double scanDollarQuote() {
        Printer.printMessageDollaQuote();
        return input.nextDouble();
    }

    public static double scanReaisAmount() {
        Printer.printMessageReaisAmount();
        return input.nextDouble();
    }

}
