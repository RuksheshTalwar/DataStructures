package dev.ruksheshtalwar.recursion;

public class Print1ToN_ByBacktracking {
    public static void main(String[] args) {
        print1ToN(5,5);
    }

    private static void print1ToN(int i, int n) {
        if (i < 1)
            return;
        print1ToN(i -1, n);
        System.out.println(i);
    }
}
