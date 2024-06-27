package Collections;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main ( String[] args ) {
        LinkedList<String> linkedList = new LinkedList<String>();
        System.out.println( linkedList.size());

        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("JavaScript");
        linkedList.add("TypeScript");
        linkedList.add("Ruby");
        linkedList.add("C#");

        System.out.println(linkedList);
        System.out.println(linkedList.size());

        linkedList.add(2, " c++");
        linkedList.remove(0);
        linkedList.remove("Ruby");

        System.out.println(linkedList);
        System.out.println(linkedList.size());


    }
}
