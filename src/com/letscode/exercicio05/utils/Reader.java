package com.letscode.exercicio05.utils;

import java.util.Scanner;

public class Reader {

    public static Scanner input = new Scanner(System.in);

    public static double scanInches() {
        Printer.printMessageEnterInches();
        return input.nextDouble();
    }

}
