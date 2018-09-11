package com.arrays;

public class ReverseArrayWithoutExtraSpace {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		reverseArray(arr);
		printArray(arr);
	}
	
	private static void reverseArray(int[] arr){
		int startIndex = 0;
		int endIndex = arr.length - 1;
		
		while (startIndex < endIndex) {
			swap(arr, startIndex, endIndex);
			
			startIndex += 1;
			endIndex -= 1;
		}
	}
	
	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void swap(int[] arr, int startIndex, int endIndex) {
		int temp;
		temp = arr[startIndex];
		arr[startIndex] = arr[endIndex];
		arr[endIndex] = temp;
	}
}
