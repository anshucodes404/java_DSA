package StackQueues;

import java.util.Stack;

public class InbuiltStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(45);
        stack.push(23);
        stack.push(90);
        stack.pop();

        System.out.println(stack);
    }
}
