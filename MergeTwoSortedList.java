/*


21. Merge Two Sorted Lists

You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.



Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]


Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.

 */
class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
    }

    public Node ( int val, Node next ) {
        this.val = val;
        this.next = next;
    }
}

public class MergeTwoSortedList {

    public Node mergeTwoLists(Node list1, Node list2) {
        // Create a dummy node to act as the starting point of the merged list
        Node dummy = new Node(-1);
        Node current = dummy;

        // Traverse both lists
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;  // Attach list1 node to current
                list1 = list1.next;    // Move list1 pointer forward
            } else {
                current.next = list2;  // Attach list2 node to current
                list2 = list2.next;    // Move list2 pointer forward
            }
            current = current.next;    // Move a current pointer forward
        }

        // If one list is exhausted, attach the remaining nodes of the other list
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        // Return the merged list starting from the next of the dummy node
        return dummy.next;
    }

    public static void printList(Node head) {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.val + " "); // Use print to keep values on the same line
            currentNode = currentNode.next;
        }
        System.out.println(); // Move to a new line after the list
    }

    public static void main ( String[] args ) {
//      Example 1
        Node list1 = new Node(1, new Node (2,new Node (4)));
        Node list2 = new Node(1, new Node (3, new Node (4)));
        Node mergedList1 = new MergeTwoSortedList().mergeTwoLists(list1, list2);
        printList(mergedList1); // Output: 1 1 2 3 4 4

        // Example 2
        Node list3 = null;
        Node list4 = null;
        Node mergedList2 = new MergeTwoSortedList().mergeTwoLists(list3, list4);
        printList(mergedList2); // Output: (empty list)

        // Example 3
        Node list5 = null;
        Node list6 = new Node(0);
        Node mergedList3 = new MergeTwoSortedList().mergeTwoLists(list5, list6);
        printList(mergedList3); // Output: 0
    }



}
