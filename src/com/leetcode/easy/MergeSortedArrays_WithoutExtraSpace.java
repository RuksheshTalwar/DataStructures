/***
 * Question : Merge 2 sorted arrays in place such that left array contains numbers < right array numbers
 * and then you sort individual arrays and merge them together in the same array
 *
 */

package com.leetcode.easy;

public class MergeSortedArrays_WithoutExtraSpace {
    public static void main(String[] args) {
//        mergeSortedArrays();
        int[] arr1 = {1,3,5,7};
        int m = arr1.length;
        int[] arr2 = {0,2,6,8,9};
        int n = arr2.length;
        mergeSortedArrays_ShellSort(arr1, m, arr2, n);
    }

    private static void mergeSortedArrays_NaiveSolution(int[] arr1, int m, int[] arr2, int n) {
        int i = 0; int j = 0; int index = 0; int[] arr3 = new int[m + n];

        while(i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                arr3[index++] = arr1[i++];
            } else {
                arr3[index++] = arr2[j++];
            }
        }

        while(i < m) {
            arr3[index++] = arr1[i++];
        }

        while(j < n) {
            arr3[index++] = arr2[j++];
        }

        for(int k = 0; k < arr3.length; k++) {
            if (k < m) {
                arr1[k]=arr3[k];
            } else {
                arr2[k - m] = arr3[k];
            }
        }
    }

    private static void mergeSortedArrays_OptimalSolution(int[] arr1, int m, int[] arr2, int n) {
        int i = m - 1;
        int j = 0;

        while (i >= 0 && j < n) {
            if (arr1[i] > arr2[j]) {
//                swap(arr1[i], arr2[j]);
            } else {
                break;
            }
        }

//        sort both the arrays now
    }

//    private static void swap(int i, int i1) {
//
//    }

    //Gap method - Shell Sorting

    //Time Complexity : O (log2 (n + m)) * O (m+n)
    //Space Complexity : O(1)
    private static void mergeSortedArrays_ShellSort(int[] arr1, int m, int[] arr2, int n) {
        int len = m + n;
        int gap = (len / 2) + (len % 2);

        while (gap > 0) {
            int left = 0;
            int right = left + gap;

            while (right < len) {
                // checking if left and right pointers are spread in both arr1 and arr2
                if (left < m && right >= m) {
                    swapIfGreater(arr1, arr2, left, right - m);
                }
                // checking if left and right pointers are in arr2 and arr2
                else if (left >= m) {
                    swapIfGreater(arr1, arr2, left - m, right);
                }
                // checking if left and right pointers are in arr1 and arr1
                else {
                    swapIfGreater(arr1, arr2, left, right);
                }
                left++; right++;
            }
            if (gap == 1) break;
            gap = (gap / 2) + (gap % 2);
        }
    }

    private static void swapIfGreater(int[] arr1, int[] arr2, int index1, int index2) {
        if (arr1[index1] > arr2[index2]) {
            swap(arr1[index1], arr2[index2]);
        }
    }

    private static void swap(int n1, int n2) {
        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;
    }
}
