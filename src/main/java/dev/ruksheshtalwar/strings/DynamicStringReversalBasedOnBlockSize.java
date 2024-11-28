/**
 * Precondition
 * -------------
 * 1. string could be null.
 * 2. blockSize will always be positive integer greater than 1.
 * <p>
 * Rules
 * ------
 * 1. If string is null then return null.
 * 2. If string length is less than blockSize then no reversal and return back the string.
 * 3. Any incomplete substring block should not be reversed.
 * Examples
 * ---------
 * (null, 2) => null
 * ("abc", 4) => "abc"
 * ("abcde", 3) => "cbade"
 * ("abcd", 4) => "dcba"
 * ("abcdef", 2) => "badcfe"
 * ("abcdefgh", 5) => "edcbafgh"
 */

package main.java.dev.ruksheshtalwar.strings;

import java.util.ArrayList;
import java.util.List;

public class DynamicStringReversalBasedOnBlockSize {
    public static void main(String[] args) {
        String str = "abcdef";
        int blockSize = 2;
        String rev = dynamicBlockRev(str, blockSize);
        System.out.println(rev);
    }

    private static String dynamicBlockRev(String str, int blockSize) {
        if (str == null) {
            return null;
        }
        if (str.length() < blockSize) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        List<Character> s = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            s.add(str.charAt(i));
            if (s.size() == blockSize) {
                for (Character c : s) {
                    sb.append(c);
                }
                sb.reverse();
                s.removeAll(s);
            }
        }
        if (!s.isEmpty()) {
            for (Character c : s) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
