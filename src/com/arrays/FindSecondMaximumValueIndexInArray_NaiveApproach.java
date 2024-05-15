package com.arrays;

public class FindSecondMaximumValueIndexInArray_NaiveApproach {
    static int getLargestIndex(int[] arr) {
        int largest = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[largest]) {
                largest = i;
            }
        }
        return largest;
    }

    static int getSecondLargestArrayNumberIndex(int[] arr, int largest){
        int result = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[largest]) {
                if (result == -1) {
                    result = i; //since we are setting result as -1 initially, so whatever the first element we find in an array we will assign that element's index to result
                } else if (arr[i] > arr[result]) {
                    result = i;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {30, 31, 32, 35, 40, 20, 21, 50, 29};
        int largest = getLargestIndex(arr);
        System.out.println("index of array's largest number is : " + largest);
        int secondLargestIndex = getSecondLargestArrayNumberIndex(arr, largest);
        System.out.println("index of array's second largest number is : " + secondLargestIndex);
    }
}
