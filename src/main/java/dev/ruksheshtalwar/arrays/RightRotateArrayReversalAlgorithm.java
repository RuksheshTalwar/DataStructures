package dev.ruksheshtalwar.arrays;


/**
 * 
 * @author Rukshesh Talwar
 * Rotating an array to the right by d places using Reversal Algorithm
 *
 */
public class RightRotateArrayReversalAlgorithm {
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int d = 2;
		rightRotate(arr, d);
		printArray(arr);
	}
	
	private static void rightRotate(int[] arr, int d) {
		int n = arr.length;
		reverseArray(arr, 0, d - 1);
		reverseArray(arr, d, n-1);
		reverseArray(arr, 0, n-1);
	}
	
	private static void reverseArray(int[] arr, int start, int end) {
		int temp;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
