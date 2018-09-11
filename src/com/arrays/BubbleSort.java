package com.arrays;

public class BubbleSort{

	public static void main(String[] args) {
		int[] arr = {18, 15, 13, 12, 11, 8, 6, 3, 2, 1};
		int n = arr.length;
		
		bubbleSortMethod(arr, n);
		printArray(arr);
		
	}

	private static void bubbleSortMethod(int[] arr, int n) {
		
		int temp;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
}
