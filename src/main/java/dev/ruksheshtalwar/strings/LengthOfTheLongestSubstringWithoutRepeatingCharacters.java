package main.java.dev.ruksheshtalwar.strings;

import java.util.HashSet;
import java.util.Set;

/**
 * Length of the longest substring without repeating characters
 */
public class LengthOfTheLongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        String str = "cadbzabcd";
        lengthOfLongestSubstringWithoutRepeatingCharacters_Optimal(str);
    }

    public static void lengthOfLongestSubstringWithoutRepeatingCharacters_BruteForce(String str) {
        char[] chars = str.toCharArray();
        int n = chars.length;
        int[] hashArr = new int[256];
        int len = 0; int maxLength = 0;
        for (int i = 0; i<hashArr.length; i++) {
            hashArr[i] = 0;
        }
        for (int i = 0; i< n; i++) {
            for (int j = i; j < n; j++) {
                if (hashArr[str.charAt(j)] == 1) break;
                len = j - i + 1;
                maxLength = Math.max(maxLength, len);
                hashArr[str.charAt(j)] = 1;
            }
        }
        System.out.println(maxLength);
    }

    private static int lengthOfLongestSubstringWithoutRepeatingCharacters(String str) {
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

    public static void lengthOfLongestSubstringWithoutRepeatingCharacters_Optimal(String str) {
        char[] chars = str.toCharArray();
        int l = chars[0]; int r = chars[0]; int length = 0; int maxLength = 0;
        int[] hashArr = new int[256];
        for (int i = 0; i < hashArr.length; i++) {
            hashArr[i] = -1;
        }

        while (r < chars.length) {
            //if the character is seen before and lies in the range between l & r
            if (hashArr[str.charAt(r)] != -1) {
                if (hashArr[str.charAt(r)] >= l) {
                    l = hashArr[str.charAt(r)] + 1;
                }
            }
            length = r - l + 1;
            maxLength = Math.max(length, maxLength);
            hashArr[str.charAt(r)] = r;
            r++;
        }
    }


    private static int lengthOfLongestSubstringWithoutRepeatingCharacters_BruteForce_Better(String str) {

        int left = 0; int right = 0;
        int length = 0;
        Set<Character> s = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            str.charAt(i);

        }
        return length;
    }
}