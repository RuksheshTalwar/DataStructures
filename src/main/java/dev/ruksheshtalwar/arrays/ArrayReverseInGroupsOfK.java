package dev.ruksheshtalwar.arrays;

/**
 * INTERVIEW QUESTION
 * Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8], k = 3 where k is the grouping number
 * Output: [3, 2, 1, 6, 5, 4, 8, 7]
 * Explanation: Elements are reversed: [1, 2, 3] → [3, 2, 1], [4, 5, 6] → [6, 5, 4], and the last group [7, 8](size < 3)
 * is reversed as [8, 7].
 */

public class ArrayReverseInGroupsOfK {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;
        reverseInGroupsOfK(arr, k);
        //print the array
        for(int i = 0; i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void reverseInGroupsOfK(int[] arr, int k) {
        for(int i = 0; i < arr.length; i = i + k) {
            int left = i;
            //Make sure that Array doesn't go out of bounds
            int right = Math.min(i + k - 1, arr.length-1);
            reverse(left, right, arr);
        }
    }

    static void reverse(int left, int right, int[] arr){
        while(left<right) {
            int temp = arr[left];
            arr[left]=  arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
