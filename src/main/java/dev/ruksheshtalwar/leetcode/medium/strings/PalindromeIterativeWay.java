package dev.ruksheshtalwar.leetcode.medium.strings;

public class PalindromeIterativeWay {
	
	public static void main(String[] args) {
		
		isPalindrome("malayalam");
		isPalindrome("abba");
		isPalindrome("maxi");
	}
	
	static void isPalindrome(String str) {
		int n = str.length();
		
		int l = 0;
		int h = n - 1;
		
		while (h > l) {
			if (str.charAt(h--) !=  str.charAt(l++)) {
				System.out.println("String not a palindrome");
				return;
			}
		}
		System.out.println("String is palindrome");
	}
}
