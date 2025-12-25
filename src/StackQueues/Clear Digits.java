package StackQueues;

import java.util.Stack;


class Solution2 {
    public static void main(String[] args) {
        String s = "g0";
        System.out.println(clearDigits(s));
    }

    public static String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        int size = s.length();
        int i = 0;
        while (i < size) {
            char ch = s.charAt(i);
            if (ch - '0' >= 0 && ch - '0' <= 9) {
                stack.pop();
            } else {
                stack.push(ch);
            }
            i++;
        }

        StringBuilder returnString = new StringBuilder();
        while(!stack.isEmpty()){
            returnString.append(stack.pop());
        }
        return returnString.reverse().toString();
    }
}