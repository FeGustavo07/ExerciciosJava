package com.letscode.exercicio03.utils;

import com.letscode.exercicio03.service.Converter;

public class Printer {

    static final String MESSAGE_ENTER_CELSIUS_DEGREE = "Enter the degree celsius: ";

    public static void printEnterCelsiusDegreeMessage() {
        System.out.print(MESSAGE_ENTER_CELSIUS_DEGREE);
    }

    public static void printConvertedDegrees(float celsius) {
        System.out.printf("Converted to Fahrenheit = %.2f", Converter.convertedToFahrenheit(celsius));
    }
}
