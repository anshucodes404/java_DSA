package StackQueues;

import java.util.ArrayDeque;
import java.util.Deque;

public class InbuiltQueue {
    public static void main(String[] args) {
//        Queue<Integer> queue = new LinkedList<Integer>();
//        //Java utilizes LL to form queue and java Queue is just an interface
//
//        queue.add(45);
//        queue.add(90);
//        queue.add(56);
//
//        System.out.println(queue.remove());
//        System.out.println(queue);

        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(34);
        deque.addFirst(90);
        deque.addLast(89);
        System.out.println(deque);

    }
}
