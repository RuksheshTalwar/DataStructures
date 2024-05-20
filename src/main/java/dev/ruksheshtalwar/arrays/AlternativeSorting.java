package dev.ruksheshtalwar.arrays;

import java.util.Arrays;

public class AlternativeSorting {

	public static void main(String[] args) {
		int[] arr = {1, 6, 9, 4, 3, 7, 8, 2, 10};
		int n = arr.length;
		alternativeSortArray(arr, n);
		
	}
	
	static void alternativeSortArray(int[] arr, int n) {
		Arrays.sort(arr);
		
		int i = 0;
		int j = n - 1;
		
		while (i < j) {
			System.out.print(arr[j--] + " ");
			System.out.print(arr[i++] + " ");
		}
		
		//If the array's elements are odd
		if (n%2 !=0) {
			System.out.print(arr[i] + " ");
		}
		
		
	}
	
}
