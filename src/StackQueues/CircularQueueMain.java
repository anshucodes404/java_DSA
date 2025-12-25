package StackQueues;

public class CircularQueueMain {
    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue();
        queue.insert(78);
        queue.insert(49);
        queue.insert(89);
        queue.insert(10);
        queue.insert(90);

        queue.display();

        System.out.println(queue.remove());
        queue.display();
    }
}
