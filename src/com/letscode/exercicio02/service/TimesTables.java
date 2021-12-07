package com.letscode.exercicio02.service;

public class TimesTables {

    static int[] result = new int[11];

    public static int[] timesTables(int number) {
        for(int i = 0; i < result.length; i++) {
            result[i] = number * i;
        }
        return result;
    }

}
