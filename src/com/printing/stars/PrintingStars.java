package com.printing.stars;


/**
 * 
 * @author rukshesh.talwar
 * Star Pattern printing
 *
 */
public class PrintingStars {

	public static void main(String[] args) {
		int n = 6;
		printStars(n);
		after180degreeRotate(n);
	}

	private static void printStars(int n) {

		int i, j;

		for (i = 0; i < n; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	private static void after180degreeRotate(int n) {

		int i, j, k = 2 * n - 2;

		// Rows
		for (i = 0; i < n; i++) {
			// Handling spaces before printing stars on right
			for (j = 0; j < k; j++) {
				System.out.print(" ");
			}
			k = k - 2;

			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
