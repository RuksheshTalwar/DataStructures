package main.java.dev.ruksheshtalwar.stacks;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String str = "[()[{()}]]";
        System.out.println(balancedParanthesis(str));
    }

    private static boolean balancedParanthesis(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
                stack.push(str.charAt(i));
            } else {
                if (stack.isEmpty()) return false;
                char c = stack.peek();
                stack.pop();
                if ((str.charAt(i) == ')' && c == '(') || (str.charAt(i) == ']' && c == '[') || (str.charAt(i) == '}' && c == '{')) {

                } else return false;
            }
        }
        if (stack.isEmpty()) return true;
        return false;
    }
}
