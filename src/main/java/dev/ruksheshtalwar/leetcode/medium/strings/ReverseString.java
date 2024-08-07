package main.java.dev.ruksheshtalwar.leetcode.medium.strings;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Hello World";
		firstSolution(str);
		System.out.println("*****");
		secondSolution(str);
		System.out.println("*****");
		reverseEachWordOfAString(str);
	}

	/**
	 * This method will reverse the string as a mirror image like Hello World -> dlroW olleH
	 *
	 */
	private static void firstSolution(String str){
		String rev = "";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
	}

	/**
	 * Reverse each word of a string like Hello World -> olleH dlroW
	 */
	private static void reverseEachWordOfAString(String str) {
		String[] words = str.split(" ");
		String rev = "";
		//Let's reverse each word of a given string
		for (String word : words) {
			String reversedWord = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				reversedWord = reversedWord + word.charAt(i);
			}
			//Store the reversed word into a rev variable
			rev = rev + reversedWord;
		}
		System.out.println(rev);
	}
	
	private static void secondSolution(String str) {
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	}
}
