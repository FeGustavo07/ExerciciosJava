package com.letscode.exercicio02;

import com.letscode.exercicio02.utils.Printer;
import com.letscode.exercicio02.utils.Reader;

public class Main {

    public static void main(String[] args) {

        int number = Reader.scanNumber();

        Printer.printTimesTablesResult(number);
    }

}
