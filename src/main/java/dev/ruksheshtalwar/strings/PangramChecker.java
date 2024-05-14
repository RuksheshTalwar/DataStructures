package dev.ruksheshtalwar.strings;

public class PangramChecker {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        if (checkPangram(str))
            System.out.print(str + " is a pangram.");
        else
            System.out.print(str + " is not a pangram.");
    }

    /**
     * Tim Complexity : O(n) -> where n is the number of characters in string
     * Space Complexity : O(1) ->
     * @param str
     * @return
     */
    public static boolean checkPangram(String str) {
        boolean[] mark = new boolean[26];
        int index = 0;

        for (int i = 0; i < str.length();i++) {
            if ('A' <= str.charAt(i) && str.charAt(i) <='Z')
                index = str.charAt(i) - 'A';
            else if ('a' <= str.charAt(i) && str.charAt(i) <='z')
                index = str.charAt(i) - 'a';
            else
                continue;
            mark[index] = true;
        }

        for(int i = 0; i<mark.length; i++)
            if (!mark[i])
                return (false);
        return (true);
    }
 }
