package Collections.Queue;

import java.util.PriorityQueue;

public class QueueExample {
    public static void main ( String[] args ) {
        PriorityQueue<Integer> queue = new PriorityQueue <Integer>();

        System.out.println(queue.size());

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());

    }
}
