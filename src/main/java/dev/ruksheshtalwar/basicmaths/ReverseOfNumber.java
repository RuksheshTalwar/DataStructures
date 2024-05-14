package dev.ruksheshtalwar.basicmaths;

public class ReverseOfNumber {
    public static void main(String[] args) {
        int n= 10400;
        System.out.println(reverseOfNumber(n));
    }

    static int reverseOfNumber(int n) {
        int reverseNum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            reverseNum = (reverseNum * 10) + lastDigit; // 00
            n = n / 10;//104
        }
        return reverseNum;
    }
}
