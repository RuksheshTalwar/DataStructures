package dev.ruksheshtalwar.reverse.integer;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to reverse:");
		int  number = sc.nextInt();
		reverseInteger(number);
	}
	
	
	static void reverseInteger(int number){
		int rev= 0;
		
		while (number != 0) {
			rev = rev * 10 + number % 10;
			number = number/10;
		}
		System.out.println(rev);
	}
}
