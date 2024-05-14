package dev.ruksheshtalwar.recursion;

public class ReverseArrayUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 6, 7, 8, 9, 0, 4, 5};
        int n = arr.length;
        int l = 0;
        int r = arr.length - 1;
        System.out.println("before calling recursive functions");
        printArray(arr);
        reverseArrayUsing2Pointers(arr, l, r);
        reverseArrayUsing1Pointer(arr, 0, n);
        System.out.println("\nafter calling recursive functions");
        printArray(arr);
    }

    private static void reverseArrayUsing2Pointers(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        //swap
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reverseArrayUsing2Pointers(arr, l + 1, r - 1);
    }

    private static void reverseArrayUsing1Pointer(int[] arr, int i, int n) {
//        arrLength -> 8, i -> 0
        if (i >= n/2) { // 4
            return;
        }
        //swap
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
        reverseArrayUsing1Pointer(arr, i + 1, n);
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
