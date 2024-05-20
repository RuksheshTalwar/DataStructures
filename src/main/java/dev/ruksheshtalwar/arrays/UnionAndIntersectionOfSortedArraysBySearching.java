package dev.ruksheshtalwar.arrays;

import java.util.Arrays;

/**
 * 
 * @author rukshesh.talwar
 * Implemented Union Of Arrays by implementing Binary Search
 * TODO : Intersection Of Arrays by implementing Binary Search is pending
 *
 */

public class UnionAndIntersectionOfSortedArraysBySearching {

	public static void main(String[] args) {
		
		int[] arr1 = {3, 1, 6, 8, 7, 10, 9, 15, 12};
		int[] arr2 = {10, 3, 7, 8, 20, 19};
		
		int m = arr1.length;
		int n = arr2.length;
		
		System.out.println("Union of arrays : ");
		printUnion(arr1, arr2, m, n);
	}

	private static void printUnion(int[] arr1, int[] arr2, int m, int n) {
		
		if (m > n) {
			Arrays.sort(arr2);
			
			for(int i = 0; i < n; i++) {
				System.out.print(arr2[i] + " ");
			}
			
			for (int i = 0; i < m; i++) {
				if (binarySearch (arr2, 0, n-1, arr1[i]) == -1) {
					System.out.print(arr1[i] + " ");
				}
			}
		
		}else {
			Arrays.sort(arr1);
			
			for (int i = 0; i < m; i++) {
				System.out.print(arr1[i] + " ");
			}
			
			for (int i = 0; i < n; i++) {
				if (binarySearch(arr1, 0, m-1, arr2[i]) ==-1)
					System.out.print(arr2[i] + " ");
					
			}
		}
	}

	private static int binarySearch(int[] arr, int l, int r, int x) {
		
		if (r >= l) {
			int mid = l + (r - l)/2;
			
			if (arr[mid] == x) {
				return mid;
			}
			
			if (arr[mid] > x)
				return binarySearch(arr, l, mid-1, x);
			return binarySearch(arr, mid+1, r, x);
		}
		return -1;
		
	}
	
}
