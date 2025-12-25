package StackQueues;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue();
        queue.insert(78);
        queue.insert(74);
        queue.insert(12);
        queue.insert(90);
        queue.insert(34);

        queue.display();

        System.out.println(queue.remove());

        queue.display();
    }
}
