package dev.ruksheshtalwar.recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetSum1 {
    public static void main(String[] args) {
        //Try to do it with an array
        int[] arr1 = {3,1,2};
        List<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(2);
        arr.add(1);
        int sum = 0;
        List<Integer> sumSubset = new ArrayList<>();
        subsetSum(0, arr, sum, sumSubset);
    }

    private static void subsetSum(int index, List<Integer> arr, int sum, List<Integer> sumSubset) {
        if (index == arr.size()) {
            sumSubset.add(sum);
            return;
        }
        subsetSum(index + 1, arr, sum + arr.get(index), sumSubset);
        subsetSum(index + 1, arr, sum, sumSubset);
    }
}
