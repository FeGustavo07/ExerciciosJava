package com.letscode.exercicio02.utils;

import java.util.Scanner;

public class Reader {

    public static Scanner input = new Scanner(System.in);

    public static int scanNumber() {
        Printer.printMessageEnterNumber();
        return input.nextInt();
    }

}
