package dev.ruksheshtalwar.arrays;

import java.util.Arrays;

public class LeftRotateArrayBy1Place {
    public static void main(String[] args) {
        int[] arr = {4,5,6,3,2,1};
        int n = arr.length;
        leftRotate(arr, n);
    }

    /**
     * Time complexity is O(n) -> where n is the number of array elements
     * Space Complexity -> O(n) -> as we are using N array elements in our algorithm
     * Extra Space Complexity -> O(1) -> as we are not using any extra space in our algorithm
     */

    static void leftRotate(int[] arr, int n) {
        int temp = arr[0];

        for (int j = 1; j < n; j++) {
            arr[j - 1] = arr[j];
        }
        arr[n-1] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
