/**
 * This is the approach of Counting Sort
 *
 */

package com.leetcode.medium.arrays;

import java.util.HashMap;
import java.util.Map;

public class SortArray_Leetcode_912 {
    public static void main(String[] args) {
        int[] nums = {5,1,1,2,0,0};
        sortArray(nums);
    }

    private static int[] sortArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int min = nums[0]; int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }

            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }

        int index = 0;
        for (int i = min; i <= max; i++) {
            while (map.getOrDefault(i, 0) > 0) {
                nums[index] = i;
                index++;
                map.put(i, map.get(i) - 1);
            }
        }
        return nums;
    }
}
