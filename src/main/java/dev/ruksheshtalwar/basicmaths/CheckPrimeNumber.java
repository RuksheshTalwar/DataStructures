package dev.ruksheshtalwar.basicmaths;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        checkPrimeNumber(17);
    }

    private static boolean checkPrimeNumber(int n) {
        int count = 0;
        for(int i = 1; i*i <= n; i++) {
            if (n % i == 0) {
                count += 1;
                if ((n / i) != i) count += 1;
            }
        }
        return (count == 2);
    }
}
