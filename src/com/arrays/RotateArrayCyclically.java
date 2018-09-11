package com.arrays;

public class RotateArrayCyclically {

	
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,3,4,5};
		int m = arr1.length;
		int n = arr2.length;
		
		rotateArrayClockwise(arr1, m);
		printArray(arr1, m);
		
		rotateArrayAntiClockwise(arr2, n);
		printArray(arr2, n);
	}
	
	static void rotateArrayClockwise(int[] arr, int n) {
		int x = arr[n - 1];
		
		for (int i = n-1; i > 0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = x;
	}
	
	static void rotateArrayAntiClockwise(int[] arr, int n) {
		
		int x = arr[0];
		
		for(int i = 1; i < n; i++) {
			arr[i-1] = arr[i];
		}
		arr[n - 1] = x;
	}
	
	static void printArray(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
}
