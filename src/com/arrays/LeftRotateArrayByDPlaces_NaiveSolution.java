package com.arrays;


/**
 * 
 * @author rukshesh.talwar
 * Algo to Left rotate an array by number of rotations specified by 'd' 
 *
 */
public class LeftRotateArrayByDPlaces_NaiveSolution {

	static void leftRotate(int[] arr, int d, int n){
		int i;
		for (i = 0; i<d;i++) {
			leftRotateByOne(arr, n);
		}
	}

	static void leftRotateByOne(int[] arr, int n) {
		int i;
		int temp;
		temp = arr[0];

		for (i = 0; i < n - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[i] = temp;
	}

	static void printArray(int[] arr) {
		
		for (int i = 0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int n = arr.length;
		int d = 2;
		
		leftRotate(arr, d, n);
		printArray(arr);
		
	}

}
