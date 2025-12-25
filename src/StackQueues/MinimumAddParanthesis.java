package StackQueues;


class Solution {
    public int minAddToMakeValid(String s) {
        // Stack<Character> stack = new Stack<>();
        // int count = 0;
        // int size = s.length();
        // int i = -1;
        // while (i < size - 1) {
        // i++;
        // if (s.charAt(i) == '(') {
        // stack.push('(');
        // } else {
        // if (stack.isEmpty()) {
        // count++;
        // continue;
        // }
        // stack.pop();
        // }

        // }

        // while (!stack.isEmpty()) {
        // stack.pop();
        // count++;
        // }

        // return count;

        // Another method

        int openingsCount = 0, missingOpenings = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(')
                openingsCount++;
            else {
                if (openingsCount <= 0) {
                    missingOpenings++;
                } else {
                    openingsCount--;
                }
            }
        }

        return openingsCount + missingOpenings;

    }
}