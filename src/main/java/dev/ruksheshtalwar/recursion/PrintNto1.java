package dev.ruksheshtalwar.recursion;

public class PrintNto1 {
    public static void main(String[] args) {
        int n = 5;
        printNumbers(n);
    }

    private static void printNumbers(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        printNumbers(n - 1);
    }
}
