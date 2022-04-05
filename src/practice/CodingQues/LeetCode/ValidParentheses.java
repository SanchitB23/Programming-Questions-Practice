package practice.CodingQues.LeetCode;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(" = " + isValid(new Scanner(System.in).next()));
    }

    private static boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        Stack<Object> stack = new Stack<>();
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(', '[', '{' -> stack.push(s.charAt(i));
                case ')' -> {
                    if (!stack.empty() && (char) stack.peek() == '(') stack.pop();
                    else flag = false;
                }
                case ']' -> {
                    if (!stack.empty() && (char) stack.peek() == '[') stack.pop();
                    else flag = false;
                }
                case '}' -> {
                    if (!stack.empty() && (char) stack.peek() == '{') stack.pop();
                    else flag = false;
                }
                default -> flag = false;
            }
            if (!flag) return false;
        }
        return stack.empty();
    }
    /*    public boolean isValid(String s) {
                if (s.length() % 2 != 0) return false;
        boolean flag = true;
        for (int i = 0; i < s.length(); i += 2) {
            switch (s.charAt(i)) {
                case '(' -> flag = s.charAt(i + 1) == ')';
                case '[' -> flag = s.charAt(i + 1) == ']';
                case '{' -> flag = s.charAt(i + 1) == '}';
                default -> flag = false;
            }
        }
        return flag;
    }*/
}
