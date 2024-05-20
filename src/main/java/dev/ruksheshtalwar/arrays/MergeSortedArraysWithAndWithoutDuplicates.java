package dev.ruksheshtalwar.arrays;

public class MergeSortedArraysWithAndWithoutDuplicates {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };
		int[] arr2 = { 8, 9, 10, 11, 12 };

		int m = arr1.length;
		int n = arr2.length;

		mergeArrays(arr1, arr2, m, n);
	}

	private static void mergeArrays(int[] arr1, int[] arr2, int m, int n) {

		int[] arr3 = new int[m + n];

		int i = 0, j = 0, k = 0;

		while (i < m && j < n) {
			if (arr1[i] < arr2[j]) {
				arr3[k++] = arr1[i++];
			} else {
				arr3[k++] = arr2[j++];
			}
		}

		while (i < m) {
			arr3[k++] = arr1[i++];
		}

		while (j < n) {
			arr3[k++] = arr2[j++];
		}

		for (int v = 0; v < arr3.length; v++) {
			System.out.print(arr3[v] + " ");
		}
	}
}
