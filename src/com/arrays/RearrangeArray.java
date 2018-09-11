package com.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * Rearrange Array such that Arr[i] = i && -1 where no matching element is found according to array index
 * For Example : {2,3,4,5,0,7}. Here '1' is not found, so -1 will be in place of arr index 1 and 7 will be omitted as we don't have till 7 elements in array
 */
public class RearrangeArray {

	public static void main(String[] args) {
		int[] arr = {-1, 2, 4, 5, 7, 8, 6, -1, 3};
		int[] arr1 = rearrangeArray(arr);
		System.out.println(Arrays.toString(arr1));
	}
	
	static int[] rearrangeArray(int[] arr) {
		
		Set<Integer> s = new HashSet<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			s.add(arr[i]);
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(s.contains(i)) {
				arr[i] = i;
			}else {
				arr[i] = -1;
			}
		}
		return arr;
		
	}
}
