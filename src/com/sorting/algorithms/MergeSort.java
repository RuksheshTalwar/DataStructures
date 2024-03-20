package com.sorting.algorithms;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,7,8,2,4,3,1,6};
        mergeSort(arr);

        for(int i = 0; i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void mergeSort(int[] arr) {
        int length = arr.length;
        if(length <= 1) return;

        int middle = length / 2;
        int[] leftArr = new int[middle];
        int[] rightArr = new int[length - middle];

        int i = 0;
        int j = 0;

        for(; i< length; i++) {
            if (i < middle)
                leftArr[i] = arr[i];
             else {
                rightArr[j] = arr[i];
                j++;
            }
        }
        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(leftArr,rightArr,arr);
    }

    private static void merge(int[] leftArr, int[] rightArr, int[] arr) {
        int leftSize = arr.length / 2;
        int rightSize = arr.length - leftSize;
        int i = 0; int l = 0; int r = 0;

        while(l < leftSize && r < rightSize) {
            if (leftArr[l] < rightArr[r]) {
                arr[i]=leftArr[l];
                i++;
                l++;
            } else {
                arr[i] = rightArr[r];
                r++;
                i++;
            }
            while(l < leftSize) {
                arr[i] = leftArr[l];
                i++;
                l++;
            }
            while(r < rightSize) {
                arr[i] = rightArr[r];
                r++;
                i++;
            }
        }
    }
}
