package com.arrays;

import java.util.Arrays;

public class LeftRotateArrayBy1Place {
    public static void main(String[] args) {
        int[] arr = {4,5,6,3,2,1};
        int n = arr.length;
        leftRotate(arr, n);
    }

    static void leftRotate(int[] arr, int n) {
        int temp = arr[0];

        for (int j = 1; j < n; j++) {
            arr[j - 1] = arr[j];
        }
        arr[n-1] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
