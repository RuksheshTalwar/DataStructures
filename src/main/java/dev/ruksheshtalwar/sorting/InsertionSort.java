package dev.ruksheshtalwar.sorting;


/**
 * 
 * @author rukshesh.talwar
 * Insertion sort Algorithm. Analogy can be taken from sorting playing cards
 * In worst cases its complexity is O(n^2)
 *
 */
public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		insertionSortAlgo(arr);
		printArray(arr);
	}
	
	static void insertionSortAlgo(int[] arr) {
		for (int j = 1; j < arr.length; j++) {
			int key = arr[j];
			
			int i = j - 1;
			while (i >= 0 && arr[i] > key) {
				arr[i + 1] = arr[i];
				i = i - 1;
			}
			arr[i + 1] = key;
		}
	}
	
	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
