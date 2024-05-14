package dev.ruksheshtalwar.recursion;

public class FactorialWays {
    public static void main(String[] args) {
        int n = 5;
        int fact = 1;
        calcFactorial(n, fact);
    }

    private static void calcFactorial(int n, int fact) {
        if (n == 0) {

        }
        calcFactorial(n - 1, n * fact);
    }
}
