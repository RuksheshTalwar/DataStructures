package com.mathematics;

public class FactorialIterative {
    public static void main(String[] args) {
        int factOfFour = factorialOfNumber(4);
        System.out.println(factOfFour);
        int factOfZero = factorialOfNumber(0);
        System.out.println(factOfZero);
        int factOfOne = factorialOfNumber(1);
        System.out.println(factOfOne);
    }

    private static int factorialOfNumber(int i) {
        int res = 1;

        for (int j = 2; j <= i; j++) {
            res = res * j;
        }

        return res;
    }
}
