package main.java.dev.ruksheshtalwar.strings;

import java.util.HashSet;
import java.util.Set;

public class LengthOfTheLongestSubstring {

    public static void main(String[] args) {
        lengthOfLongestSubstring("");
    }

    private static int lengthOfLongestSubstring(String str) {
        int maxLength = 0;

        for (int i = 0; i < str.length(); i++) {
            StringBuilder currentSubstring = new StringBuilder();
            for (int j = i; j < str.length(); j++) {
                if (currentSubstring.indexOf(String.valueOf(str.charAt(j))) != -1) {
                    break;
                }
                currentSubstring.append(str.charAt(j));
                maxLength = Math.max(maxLength, currentSubstring.length());
            }
        }
        return maxLength;
    }


    private static int lengthOfLongestSubstringBetter(String str) {

        int left = 0; int right = 0;
        int length = 0;
        Set<Character> s = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            str.charAt(i);

        }
        return length;
    }
}