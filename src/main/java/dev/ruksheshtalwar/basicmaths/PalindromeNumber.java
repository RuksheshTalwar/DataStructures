package dev.ruksheshtalwar.basicmaths;

public class PalindromeNumber {
    public static void main(String[] args) {
        if (checkPalindrome(121)) {
            System.out.println("Its a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    static boolean checkPalindrome(int n) {
        int reverseNum = 0;
        int dup = 121;
        while (n > 0) {
            int lastDigit = n % 10;
            reverseNum = (reverseNum * 10) + lastDigit;
            n = n / 10;
        }
        return (reverseNum == dup);
        }
    }
