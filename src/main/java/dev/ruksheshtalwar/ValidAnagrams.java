package dev.ruksheshtalwar;

public class ValidAnagrams {
    public static void main(String[] args) {
        isAnagram("anagram", "nagaram");
    }


    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] char_counts = new int[26];
        for (int i = 0; i< s.length(); i++) {
            char_counts[s.charAt(i) - 'a']++;
            char_counts[t.charAt(i) - 'a']--;
        }

        for (int c : char_counts) {
            if (c !=0) {
                return false;
            }
        }
        return true;
    }
}
