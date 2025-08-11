package dev.ruksheshtalwar.strings;

import java.util.Stack;

public class RemoveAllOccurencesOfASubString {

    public static void main(String[] args) {
        String str = "daabcbaabcbc";
        String part = "abc";
        String sol = solution(str, part);
        System.out.println(sol);
    }

    static String solution(String str, String part) {
        Stack<Character> st = new Stack();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));
            if(st.size() >= part.length()) {
                for (int j = 0; j < part.length(); j++) {
                    sb.append(st.pop());
                }
                if(!(sb.reverse().toString().equals(part))) {
                    for (int j = 0; j < sb.length(); j++) {
                        st.push(sb.charAt(j));
                    }
                }
                sb.delete(0, sb.length());
            }
        }
        StringBuilder solution = new StringBuilder();
        while (!st.isEmpty()) {
            solution.append(st.pop());
        }
        return String.valueOf(solution.reverse());
    }

    static String optimalSolution(String str, String part) {
        StringBuilder result = new StringBuilder();
        int partLen = part.length();
        for (int i = 0; i < str.length(); i++) {
            result.append(str.charAt(i));
            if (result.length() >= partLen && result.substring(result.length() - partLen).equals(part)) {
                result.delete(result.length() - partLen, result.length());
            }
        }
        return result.toString();
    }
}
