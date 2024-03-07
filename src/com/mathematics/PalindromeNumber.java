package com.mathematics;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindromeNumber(121));
        System.out.println(isPalindromeNumber(-121));
        System.out.println(isPalindromeNumber(7667));
        System.out.println(isPalindromeNumber(7668));
    }

    private static boolean isPalindromeNumber(int x) {
        int rev = 0;
        int temp = x;
        if (x < 0) {
            return false;
        }
        while (temp != 0) {
            int lastDigit = temp % 10;
            temp = temp / 10;
            rev = rev * 10 + lastDigit;
        }

        return rev == x;
    }
}
