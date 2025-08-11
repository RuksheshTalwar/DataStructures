package dev.ruksheshtalwar.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        int[] arr = {100, 1, 3, 4};
        brute(arr);
        better(arr);
        optimal(arr);
    }

    private static void optimal(int[] arr) {
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i< arr.length; i++) {
            s.add(arr[i]);
        }

    }

    private static void better(int[] arr) {
        Arrays.sort(arr);
        int currentCount = 0; int lastSmaller = Integer.MIN_VALUE;
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] - 1 == lastSmaller) {

            }

        }
    }

    private static void brute(int[] arr) {
        for (int i = 0; i< arr.length; i++) {
            int x = arr[i];
            int cnt = 1;
            while (linearSearch(arr, x) == true) {
                x = x + 1;
                cnt = cnt + 1;
            }
        }
    }

    private static boolean linearSearch(int[] arr, int num) {
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] == num) return true;
        }
        return false;
    }


}
