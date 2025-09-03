package dev.ruksheshtalwar.arrays;

public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] arr = {-2, -3, -4, 1, 4, 2, 5, 8, 6, 9};
        maxSubArraySum_Optimal(arr);
    }

    static Long maxSubArraySum_Optimal(int[] arr) {
        int ansStart, ansEnd = -1;
        int start = 0;
        Long maxSum = Long.MIN_VALUE;
        Long currentSum = 0L;
        for (int i  = 0; i< arr.length; i++) {
            if (currentSum == 0) start = i;
            currentSum += arr[i];
            /**
             * If currentSum goes negative, re-initialize the sum to 0 so that it becomes +ve again
             * That is equivalent to say, do not carry any negatives into the future
             */
            if (currentSum < 0) {
                currentSum = 0L;
            }

            //Keeps track of the subarray
            if (currentSum > maxSum) {
                maxSum = currentSum;
                ansStart = start;
                ansEnd = i;
            }

            maxSum = Math.max(maxSum, currentSum);

        }
        /**
         * If array contains all negative numbers, then maxSum will be negative at the end, return 0
         */
        if (maxSum < 0) {
            maxSum = 0L;
        }
        return maxSum;
    }
}
