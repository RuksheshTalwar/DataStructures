package dev.ruksheshtalwar.leetcode.medium.strings;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Hello World";
		
		firstSolution(str);
		
		System.out.println("*****");
		
		secondSolution(str);
		
	}
	
	private static void firstSolution(String str){
		String rev = "";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
	}
	
	private static void secondSolution(String str) {
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	}
}
