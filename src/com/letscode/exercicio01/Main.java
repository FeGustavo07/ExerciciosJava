package com.letscode.exercicio01;

import com.letscode.exercicio01.utils.Printer;
import com.letscode.exercicio01.utils.Reader;

public class Main {

    public static void main(String[] args) {

        double firstNumber = Reader.scanFirstNumber();
        double secondNumber = Reader.scanSecondNumber();

        Printer.printSumResult(firstNumber, secondNumber);
        Printer.printMinusResult(firstNumber, secondNumber);
        Printer.printTimesResult(firstNumber, secondNumber);
        Printer.printDivisionResult(firstNumber, secondNumber);
    }
}
