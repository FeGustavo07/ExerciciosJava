package com.letscode.exercicio04;

import com.letscode.exercicio04.utils.Printer;
import com.letscode.exercicio04.utils.Reader;

public class Main {

    public static void main(String[] args) {

        double dollarQuote = Reader.scanDollarQuote();
        double reais = Reader.scanReaisAmount();

        Printer.printReaisConvertedToDollar(reais, dollarQuote);

    }

}
