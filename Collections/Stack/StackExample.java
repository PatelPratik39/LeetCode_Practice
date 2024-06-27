package Collections.Stack;

import java.util.Stack;

public class StackExample {
    public static void main ( String[] args ) {
        Stack<Integer> stack = new Stack <Integer>();
        System.out.println(stack.size());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack);
    }
}
