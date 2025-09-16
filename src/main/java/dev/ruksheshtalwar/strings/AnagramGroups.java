package dev.ruksheshtalwar.strings;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class AnagramGroups {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("bat", "tab", "tap", "pat", "top", "pot", "opt");

        Map<String, Set<String>> anagramMap = new LinkedHashMap<>();

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedKey = new String(chars);

            // Use LinkedHashSet to preserve insertion order
            if (!anagramMap.containsKey(sortedKey)) {
                anagramMap.put(sortedKey, new LinkedHashSet<>());
            }

            anagramMap.get(sortedKey).add(word);
        }

        // grouped anagrams are printed
        for (Set<String> group : anagramMap.values()) {
            System.out.println(group);
        }
    }
}

