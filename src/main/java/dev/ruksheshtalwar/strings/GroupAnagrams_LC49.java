package main.java.dev.ruksheshtalwar.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams_LC49 {
    public static void main(String[] args) {
        String[] strs = {"eat", "ate", "bat"};
        groupingAnagrams(strs);

    }

    private static void groupingAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
        }
    }
}
