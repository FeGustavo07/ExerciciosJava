package com.letscode.exercicio04.utils;

import com.letscode.exercicio04.service.Converter;

public class Printer {

    static final String MESSAGE_ENTER_DOLLAR_QUOTE = "Enter the today's dollar quote: ";
    static final String MESSAGE_ENTER_REAIS_AMOUNT = "Enter the amount of reais: ";

    public static void printMessageDollaQuote() {
        System.out.print(MESSAGE_ENTER_DOLLAR_QUOTE);
    }

    public static void printMessageReaisAmount() {
        System.out.print(MESSAGE_ENTER_REAIS_AMOUNT);
    }

    public static void printReaisConvertedToDollar(double reais, double dolarQuote) {
        System.out.printf("R$%.1f Reais = $%.1f Dollars", reais, Converter.convertedToDollar(reais, dolarQuote));
    }
}
