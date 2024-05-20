package dev.ruksheshtalwar.arrays;

import java.util.Arrays;

public class MergeSortedArrays_WithExtraSpace {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {5, 8, 15, 20, 50, 60, 70};
        int temp[] = mergeSortedArrays(arr1, arr2);
        System.out.println(Arrays.toString(temp));
    }

    private static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int m = arr1.length;
        int n = arr2.length;
        int[] sortedArr = new int[m + n];
        int index = 0;

        while(i < m && j < n) {
            if (arr1[i] <= arr2[j]) {
                sortedArr[index++] = arr1[i++];
            } else {
                sortedArr[index++] = arr2[j++];
            }
        }

        while (i < m) {
            sortedArr[index++] = arr1[i++];
        }

        while (j < n) {
            sortedArr[index++] = arr2[j++];
        }
        return sortedArr;
    }
}
