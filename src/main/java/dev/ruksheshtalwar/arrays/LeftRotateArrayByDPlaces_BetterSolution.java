package dev.ruksheshtalwar.arrays;

import java.util.Arrays;

public class LeftRotateArrayByDPlaces_BetterSolution {
    public static void main(String[] args) {
        int[] arr = {4,5,6,3,2,1};
        int d = 2;
        int n = arr.length;
        leftRotateArrayByDPlaces(arr, n, d);
    }

    private static void leftRotateArrayByDPlaces(int[] arr, int n, int d) {
        int[] temp = new int[d];

        for (int i = 0; i < d; i++) {
            temp[i] = arr[i]; //temp[] = {4,5}
        }

        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i]; // arr[i - d] means gap between (current element and d) we will take
            // and then assign current element to arr[i - d]
            //O/P : arr[] = {6, 3, 2, 1, 2, 1}
        }

        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i]; //O/P : arr[] = {6, 3, 2, 1, 4, 5}
        }
        System.out.println(Arrays.toString(arr));
    }
}
