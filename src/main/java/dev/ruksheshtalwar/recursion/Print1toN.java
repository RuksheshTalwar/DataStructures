package dev.ruksheshtalwar.recursion;

public class Print1toN {
    public static void main(String[] args) {
        int n = 1;
        printNumbers1ToN(n);
    }

    private static void printNumbers1ToN(int n) {
        if (n == 6) return;
        System.out.println(n);
        printNumbers1ToN(n + 1);
    }
}
