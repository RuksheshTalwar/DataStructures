package dev.ruksheshtalwar.recursion;

public class FactorialCalc {
    public static void main(String[] args) {
        int n = 5;
        int fact = printFactorial(n);
        System.out.println(fact);
    }

    private static int printFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact_nm1 = printFactorial(n - 1);
        int result = n * fact_nm1;
        return result;
    }
}
