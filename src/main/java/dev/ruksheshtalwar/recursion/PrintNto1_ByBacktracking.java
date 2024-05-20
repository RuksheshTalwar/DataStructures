package dev.ruksheshtalwar.recursion;

public class PrintNto1_ByBacktracking {
    public static void main(String[] args) {
        printNTo1(1, 5);
    }

    private static void printNTo1(int i, int n) {
        if (i > n)
            return;
        printNTo1(i + 1, n);
        System.out.println(i);
    }
}
