package dev.ruksheshtalwar.basicmaths;

public class GCDOfNumbers {
    public static void main(String[] args) {
        System.out.println(findGCD(52, 10));
    }

    private static int findGCD(int a, int b) {
        while (a > 0 && b  > 0) {
            if (a > b) a = a % b;
            else b = b % a;
        }
        if (a == 0) return b;
        return a;
    }
}
