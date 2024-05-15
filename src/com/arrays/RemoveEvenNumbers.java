package com.arrays;

import java.util.Arrays;

public class RemoveEvenNumbers {

    static int[] removeEvenIntegers(int[] arr) {
        int oddNumbersCounter = 0;

        for (int i = 0; i< arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddNumbersCounter++;
            }
        }

        int[] resultArr = new int[oddNumbersCounter];
        int index = 0;
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] % 2 != 0) {
                resultArr[index] = arr[i];
                index++;
            }
        }
        return resultArr;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,2,5,7,8,9,10};
        System.out.println("before removing even numbers from array : " + Arrays.toString(arr));
        int[] arrWithRemovedEvenIntegers = removeEvenIntegers(arr);
        System.out.println("after removing even numbers from array : " + Arrays.toString(arrWithRemovedEvenIntegers));
    }
}
