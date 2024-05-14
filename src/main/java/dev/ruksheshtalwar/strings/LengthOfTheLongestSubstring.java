package dev.ruksheshtalwar.strings;

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
}
