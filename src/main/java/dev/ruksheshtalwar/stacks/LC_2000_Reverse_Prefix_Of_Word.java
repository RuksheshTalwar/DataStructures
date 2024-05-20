package dev.ruksheshtalwar.stacks;

import java.util.Stack;

public class LC_2000_Reverse_Prefix_Of_Word {
    public static void main(String[] args) {
        String str = "abcdefd";
        char ch = 'd';
        String output = reversePrefix(str, ch);
        System.out.println(output);
    }

    static String reversePrefix(String word, char ch) {
        int firstOccurrence = word.indexOf(ch);
        //Edge case ->
        if (firstOccurrence == -1) {
            return word;
        }
        Stack<Character> charStack = new Stack<>();
        //PUSH elements to stack
        for (int i = 0; i <= firstOccurrence; i++) {
            charStack.push(word.charAt(i));
        }

        StringBuilder result = new StringBuilder();
        //POP elements of stack
        while (!charStack.isEmpty()) {
            result.append(charStack.pop());
        }
        //Add all remaining elements
        for (int i = (firstOccurrence + 1); i < word.length(); i++) {
            result.append(word.charAt(i));
        }
        return result.toString();
    }

}
