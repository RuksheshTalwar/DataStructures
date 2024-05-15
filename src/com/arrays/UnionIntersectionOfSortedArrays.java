package com.arrays;

import java.util.Arrays;

public class UnionIntersectionOfSortedArrays {
	public static void main(String[] args) {
		int[] arr1 = {9, 11, 2, 6, 17, 13};
		int[] arr2 = {10, 6, 15, 13, 3, 7};
		int[] arr3 = {11, 9, 4, 6, 5, 13};
		
		int m = arr1.length;
		int n = arr2.length;
		int o = arr3.length;
		
		System.out.println("Union of arrays : ");
		printUnion(arr1, arr2, m, n);
		
		System.out.println("Intersection of arrays : ");
		printIntersection(arr1, arr2, arr3, m, n, o);
	}

	private static void printIntersection(int[] arr1, int[] arr2, int[] arr3, int m, int n, int o) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		Arrays.sort(arr3);
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < m && j < n && k < o) {
			if (arr1[i] < arr2[j])
				i++;
			else if (arr2[j] < arr1[i])
				j++;
			else if (arr3[k] < arr1[i])
				k++;
			else {
				System.out.print(arr1[i++] + " ");
				j++;
				k++;
			}
			
		}
		
	}

	private static void printUnion(int[] arr1, int[] arr2, int m, int n) {
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int i = 0;
		int j = 0;
		
		while (i < m && j < n) {
			
			if (arr1[i] < arr2[j]) {
				System.out.print(arr1[i++] + " ");
			}else if (arr1[i] > arr2[j]) {
				System.out.print(arr2[j++] + " ");
			}else {
				System.out.print(arr2[j++] + " ");
				i++;
			}
			
		}
		
		while (i < m) {
			System.out.print(arr1[i++]+ " ");
		}
		while (j < n) {
			System.out.print(arr2[j++]+ " ");
		}
		
	}
	
}
