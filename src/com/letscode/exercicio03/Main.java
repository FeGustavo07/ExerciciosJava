package com.letscode.exercicio03;

import com.letscode.exercicio03.utils.Printer;
import com.letscode.exercicio03.utils.Reader;

public class Main {

    public static void main(String[] args) {

        float celsius = Reader.scanCelsiusDegree();

        Printer.printConvertedDegrees(celsius);
    }

}
