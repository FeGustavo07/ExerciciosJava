package com.letscode.exercicio05.utils;

import com.letscode.exercicio05.service.Converter;

public class Printer {

    static final String MESSAGE_ENTER_INCHES = "Enter the inches: ";

    public static void printMessageEnterInches() {
        System.out.print(MESSAGE_ENTER_INCHES);
    }

    public static void printConvertedMeasures(double inches) {
        System.out.printf("%.1f inches in centimeters is %.2f", inches, Converter.convertedToCentimeters(inches));
    }

}
