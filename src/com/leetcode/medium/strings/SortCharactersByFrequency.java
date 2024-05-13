package com.leetcode.medium.strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        String s = frequencySort("tree");
        System.out.println(s);
    }

    private static String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> treeMap = new TreeMap<>(map);
        for (Character sKey : treeMap.keySet()) {
            if (treeMap.get(sKey) > 1) {

            }
            sb.append(sKey);
        }
        return sb.toString();
    }

}
