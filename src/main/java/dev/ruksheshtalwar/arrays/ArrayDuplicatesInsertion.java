package main.java.dev.ruksheshtalwar.arrays;

import java.util.*;

public class ArrayDuplicatesInsertion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 3, 2, 4, 5, 6};
        insertDuplicates(arr);
    }

    //SC-> O(n) visitedList -> {1,2, 3, }
    // hash[]
    // 1 -> 0
    // 2->1
    // 3 -> 3
    //
    // contains(3)
    //arr[i] : i
    // duplicate case
    //arr[new] -> {1, 3,2,1, }
    //
    // i -> 0, 1,
    //TC->
    //Map<Integer, Integer> visitedDuplicates ->
    private static void insertDuplicates(int[] arr) {
        List<Integer> duplicatesList = new ArrayList<>();
        Map<Integer, Integer> intMap = new HashMap<>();

        for (Integer n : arr) {
            if (!intMap.containsKey(n)) {
                intMap.put(n, 1);
            } else {
                intMap.put(n, intMap.get(n) + 1);
            }
            //keys-> element , value -> frequency
            //>1 ->
        }

        for (Map.Entry<Integer, Integer> entry : intMap.entrySet()) {
            if (entry.getValue() > 1) {
                for (int i = 0; i < entry.getValue(); i++) {
                    duplicatesList.add(entry.getKey());
                }
            }
        }
        System.out.println(duplicatesList);
    }
}
