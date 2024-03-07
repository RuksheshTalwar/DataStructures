package com.arrays;

public class FindSecondLargestValueIndexInArray {
    public static void main(String[] args) {
        int[] arr = {20, 21, 24, 25, 0, 1, 27, 29, 30, 36, 40};
        int largest = 0;
        int result = -1;
        int secondLargestValueIndex = secondLargestValueIndexInArray(arr, largest, result);
        System.out.println(secondLargestValueIndex);
    }
    static int secondLargestValueIndexInArray(int[] arr, int largest, int result) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[largest]) {
                result = largest;
                largest = i;
            } else if (arr[i] != arr[largest]) {
                if (result == -1 || arr[i] > arr[result]) {
                    result = i;
                }
            }
        }
        return result;
    }
}
