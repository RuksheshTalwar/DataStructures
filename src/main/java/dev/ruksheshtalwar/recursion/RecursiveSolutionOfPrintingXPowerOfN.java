package dev.ruksheshtalwar.recursion;

public class RecursiveSolutionOfPrintingXPowerOfN {
    public static void main(String[] args) {
        int n = 7;
        int x = 2;
        int ans = calcPower(x, n);
        System.out.println(ans);
    }

    private static int calcPower(int x, int n) {
        if(n == 0) {
            return 1;
        }
        if(x == 0) {
            return 0;
        }
        int xPowNMinus1 = calcPower(x,n - 1);
        int xPowN = x * xPowNMinus1;
        return xPowN;
    }
}
