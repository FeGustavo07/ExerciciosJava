package com.letscode.exercicio01.utils;

import java.util.Scanner;

public class Reader {

    public static Scanner input = new Scanner(System.in);

    public static double scanFirstNumber() {
        Printer.printMessageFirstNumber();
        return input.nextDouble();
    }

    public static double scanSecondNumber() {
        Printer.printMessageSecondNumber();
        return input.nextDouble();
    }
}
