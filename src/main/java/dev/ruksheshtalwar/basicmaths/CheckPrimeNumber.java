/**
 *
 */

package main.java.dev.ruksheshtalwar.basicmaths;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        checkPrimeNumber(17);
    }

    private static boolean checkPrimeNumber(int n) {
        int count = 0;
        // we just have to loop till the square root of the number
        for(int i = 1; i*i <= n; i++) {
            if (n % i == 0) {
                count += 1;
                /**
                 * this check is for finding the prime numbers or divisors which comes after the square root of a number
                 * Edge case -> if n / i == i that is, suppose n = 36 if 36 / 6 == 6 then 6 was already considered in the first half
                 * when the loop was till the square root of number, we don't need to pick 6 again
                  */
                if ((n / i) != i) count += 1;
            }
        }
        return (count == 2);
    }
}
