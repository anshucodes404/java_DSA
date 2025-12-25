package StackQueues;

public class CustomStackMain {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack(1);
        stack.push(89);
        stack.push(23);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
