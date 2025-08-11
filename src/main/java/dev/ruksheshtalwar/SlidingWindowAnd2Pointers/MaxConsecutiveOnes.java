package main.java.dev.ruksheshtalwar.SlidingWindowAnd2Pointers;

import java.util.List;

/**
 * This problem can also be taken as Longest subarray with at most k zeros
 * meaning in a subarray there would be at most k zeros, so that when
 * at most k zeros are flipped to 1 that subarray would be the longest with maximum 1s
 */
public class MaxConsecutiveOnes {
    public static void main(String[] args) {

        List<Integer> li = List.of(1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0);
        int k = 2;
        int maxLen= betterSolution(li, k);
        System.out.println(maxLen);
//        bruteForce(arr, k);

    }

//    public static void bruteForce(int[] arr, int k) {
//        int length = 0;
//        int maxLength = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            int noOfZeros = 0;
//            for (int j = i; j < arr.length; j++) { //Where i starts, j starts as well
//                if (arr[j] == 0) noOfZeros++;
//
//                if (noOfZeros <= k) {
//                    length = j - i + 1;
//                    maxLength = Math.max(length, maxLength);
//                } else break;
//            }
//        }
//    }


    public static int betterSolution(List<Integer> li, int k) {
        int length = 0;
        int maxLength = 0;
        int left = 0;
        int right = 0;
        int noOfZeros = 0;

        while (right < li.size()) {
            if (li.get(right).equals(0)) noOfZeros++;

            while (noOfZeros > k) {
                if (li.get(left).equals(0)) noOfZeros--;
                left++;
            }
            if (noOfZeros <= k) {
                length = right - left + 1;
                maxLength = Math.max(maxLength, length);
            }
            right++;
        }

        return maxLength;
    }
}
