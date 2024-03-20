package com.leetcode.easy.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Question : Longest Subarray whose sum is equal to K
 */
public class LongestSubarrayWithGivenSumK {
    public static void main(String[] args) {
        int[] arr = {10,15,-5,15,-10,5};
        longestSubArray_Naive(arr, 5);
    }

    private static void longestSubArray_Naive(int[] arr, int k) {
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) length = Math.max(length, j- i + 1);
            }
        }
        System.out.println(length);
    }

    private static int longestSubArray_Better(int[] nums, int k) {
        int currentSum = 0;
        int sum = 0;
        int maxLength = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = -1;
            }
            currentSum += nums[i];
            if (currentSum - sum == 0) {
                maxLength = Math.max(maxLength, i + 1);
            }
            if (map.containsKey(currentSum - sum)) {
                int length = i - map.get(currentSum - sum);
                maxLength = Math.max(maxLength, length);
            }
            if (!map.containsKey(currentSum - sum)) {
                map.put(currentSum, i);
            }
        }
        return maxLength;
    }

    //2 pointer approach
    private static int longestSubArray_Optimal(int[] nums, int k) {
        int left = 0; int right = 0;
        int n = nums.length;
        int sum = nums[0];
        int maxLength = 0;

        while(right < n) {
            while(left <= right && sum > k) {
                sum -= nums[left];
                left++;
            }
            if (sum == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
            right++;
            if (right < n) sum += nums[right];
        }
        return maxLength;
    }

}
