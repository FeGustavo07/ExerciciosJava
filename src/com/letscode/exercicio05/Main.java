package com.letscode.exercicio05;

import com.letscode.exercicio05.utils.Printer;
import com.letscode.exercicio05.utils.Reader;

public class Main {

    public static void main(String[] args) {
        double inches = Reader.scanInches();

        Printer.printConvertedMeasures(inches);
    }

}
