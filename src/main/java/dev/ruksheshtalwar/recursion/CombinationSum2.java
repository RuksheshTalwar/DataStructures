package main.java.dev.ruksheshtalwar.recursion;

import main.java.dev.ruksheshtalwar.sorting.QuickSortImpl;

import java.util.*;

public class CombinationSum2 {
    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> ans;
        ans = combinationSum(candidates, target);
        System.out.println(ans);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        QuickSortImpl.quickSort(candidates, 0, candidates.length - 1);
        findCombinationSum(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }

    private static void findCombinationSum(int index, int[] candidates, int target, List<List<Integer>> ans, List<Integer> ds) {
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            //To avoid picking up same elements twice and in turn avoiding duplicate combinations
            // i > index means its not the first time that we are going to pick duplicate element
            if (i > index && candidates[i] == candidates[i - 1]) continue;
            //Since the array is sorted, if the previous array element > target can't be picked, then subsequent elements will also not be picked
            if (candidates[i] > target) break;
            ds.add(candidates[i]);
            findCombinationSum(i + 1, candidates, target - candidates[i], ans, ds);
            ds.remove(ds.size() - 1);
        }
    }
}
