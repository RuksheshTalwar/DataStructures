package dev.ruksheshtalwar.recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumUsingBacktracking {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        int target = 7;
        List<List<Integer>> ans;
        ans = combinationSum(arr, target);
        System.out.println(ans);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }

    public static void findCombinations(int index, int[] candidates, int target, List<List<Integer>> ans, List<Integer> ds) {
        if (index == candidates.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if (candidates[index] <= target) {
            ds.add(candidates[index]);
            findCombinations(index, candidates, target - candidates[index], ans, ds);
            ds.remove(ds.size() - 1);
        }
        findCombinations(index + 1, candidates, target, ans, ds);
    }
}
