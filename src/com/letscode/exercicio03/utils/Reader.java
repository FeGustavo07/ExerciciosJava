package com.letscode.exercicio03.utils;

import java.util.Scanner;

public class Reader {

    public static Scanner input = new Scanner(System.in);

    public static float scanCelsiusDegree() {
        Printer.printEnterCelsiusDegreeMessage();
        return input.nextFloat();
    }

}
