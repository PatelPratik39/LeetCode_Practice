/**
 *  160. Intersection of Two Linked Lists
 *
 */

package LeetCode_problems;

public class IntersectionOfTwoLinkedLists {
    static class Node {
        int value;
        Node next;
        public Node(int value){
            this.value = value;
            this.next = null;
        }
    }

    private static Node getIntersectionNode ( Node headA, Node headB ) {
//        two pointers Approach
        if(headA == null || headB == null){
            return null;
        }

        Node pointerA = headA;
        Node pointerB = headB;
        while(pointerA != pointerB){
            // If pointerA reaches the end of list A, redirect it to the head of list B
            pointerA = (pointerA == null) ? headB : pointerA.next;

            // If pointerB reaches the end of list B, redirect it to the head of list A
            pointerB = (pointerB == null) ? headA : pointerB.next;

        }
        return pointerA;

    }

    public static void main ( String[] args ) {

        // Example 1:
        Node headA = new Node(4);
        headA.next = new Node(1);
        Node intersection = new Node(8);
        headA.next.next = intersection;
        intersection.next = new Node(4);
        intersection.next.next = new Node(5);

        Node headB = new Node(5);
        headB.next = new Node(6);
        headB.next.next = new Node(1);
        headB.next.next.next = intersection;


        Node result = getIntersectionNode(headA, headB);
        System.out.println("Intersected at '" + (result != null ? result.value : "No intersection") + "'");  // Output: 8

    }


}
