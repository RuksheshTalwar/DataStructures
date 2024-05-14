package dev.ruksheshtalwar.basicmaths;

public class ArmstrongNumber {
    public static void main(String[] args) {
        if (checkArmstrongNumber(7789)) {

        }
    }

    static boolean checkArmstrongNumber(int n) {
        int dup = n;
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sum = sum + (lastDigit * lastDigit * lastDigit);
            n = n / 10;
        }
        return (dup == n);
    }
}
