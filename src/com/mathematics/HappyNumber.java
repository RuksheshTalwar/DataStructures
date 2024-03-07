package com.mathematics;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappyNumber(65536));
    }

    private static boolean isHappyNumber(int number) {
        Set<Integer> usedIntegers = new HashSet<>();

        while (true) {
            int sum = 0;
            while (number != 0) {
                // Square all the digits of the number by starting from the last digit
                sum += Math.pow(number % 10, 2.0);
                // Remove the last digit of the number
                number = number / 10;
            }

            if (sum == 1) return true;

            number = sum;

            if (usedIntegers.contains(number))
                return false;
            usedIntegers.add(number);
        }
    }
}
