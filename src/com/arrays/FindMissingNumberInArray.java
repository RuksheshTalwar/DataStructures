package com.arrays;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,5,6,7,8,9,10,11};
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		
		int sum1 = 0;
		
		for (int j = 1; j <= 11; j++) {
			sum1 = sum1 + j;
		}
		
		System.out.println("Missing number ::" + (sum1-sum));
	}
}
