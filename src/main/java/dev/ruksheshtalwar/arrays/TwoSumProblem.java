package dev.ruksheshtalwar.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSumProblem {
    public static void main(String[] args) {
        int[] arr = {2,6, 7, 8, 9, 10};
        int target = 14;
        List<Integer> list = twoSumProblemToAcheiveTargetValue_Optimal(arr, target);
        list.forEach(System.out::println);
    }

    static List<Integer> twoSumProblemToAcheiveTargetValue_Optimal(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int more = target - arr[i];
            if (map.containsKey(more)) {
                int indexOfMore = map.get(more);
                list.add(indexOfMore);
                list.add(i);
                break;
            }
            map.put(arr[i], i);
        }
        return list;
    }
}
