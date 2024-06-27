package Collections.Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReversedQueueUsingQueueExample {

    public static void reverse( Queue<Integer> queue ){
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty())
            stack.push(queue.remove());
        while ((!stack.isEmpty()))
            queue.add(stack.pop());
    }


    public static void main ( String[] args ) {
            Queue<Integer> queue = new ArrayDeque <>();
            queue.add(10);
            queue.add(20);
            queue.add(30);
            queue.add(40);
            queue.add(50);
            queue.add(60);

        System.out.println("Original Queue : " + queue);
        reverse(queue);
        System.out.println("Reversed Queue" + queue);



    }
}
