/**
 *  141. Linked List Cycle
 *
 *  Given head, the head of a linked list, determine if the linked list has a cycle in it.
 *
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
 *
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: head = [3,2,0,-4], pos = 1
 * Output: true
 * Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
 * Example 2:
 *
 *
 * Input: head = [1,2], pos = 0
 * Output: true
 * Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
 * Example 3:
 *
 *
 * Input: head = [1], pos = -1
 * Output: false
 * Explanation: There is no cycle in the linked list.
 *
 *
 * Constraints:
 *
 * The number of the nodes in the list is in the range [0, 104].
 * -105 <= Node.val <= 105
 * pos is -1 or a valid index in the linked-list.
 *
 *
 * Follow up: Can you solve it using O(1) (i.e. constant) memory?
 *
 */

package LeetCode_problems;



public class LinkedListCycle {
    static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node node;

        public void append ( int data ) {
            Node newNode = new Node(data);

            if(node == null){
                node = newNode;
                return;
            }
            Node last = node;
            while(last.next != null){
                last = last.next;
            }
            last.next = newNode;
        }

        // Method to create a cycle in the linked list for testing
        public void createCycle(int pos) {
            if (pos == -1) return; // No cycle if pos is -1

            Node tail = node;
            Node cycleNode = null;
            int currentPosition = 0;

            // Traverse the list to find the tail and the node where the cycle should start
            while (tail.next != null) {
                if (currentPosition == pos) {
                    cycleNode = tail;
                }
                tail = tail.next;
                currentPosition++;
            }

            // Create the cycle
            if (cycleNode != null) {
                tail.next = cycleNode;
            }
        }

        public boolean hasCycle ( ) {
            if(node == null || node.next == null){
                return false;
            }

            Node slow = node;
            Node fast = node;

            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;

                if(slow == fast){
                    return true;
                }
            }
            return false;
        }
    }

    public static void main ( String[] args ) {
        LinkedList list = new LinkedList();

        // Create a linked list [3, 2, 0, -4]
        list.append(3);
        list.append(2);
        list.append(0);
        list.append(-4);

        // Create a cycle at position 1 (0-indexed)
        list.createCycle(1);

        // Check if the linked list has a cycle
        boolean result = list.hasCycle();
        System.out.println("Cycle detected: " + result); // Expected output: true
    }
}
