package LeetCode_problems;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

public class AddTwoNumOfLinkedList {

//    creating LinkedList
    private static Node createLinkedList ( int[] values ) {
        if(values.length == 0){
            return null;
        }
        Node head = new Node(values[0]);
        Node currentNode = head;

        for(int i = 0; i < values.length; i++){
            currentNode.next = new Node(values[i]);
            currentNode = currentNode.next;
        }
        return head;
    }

    private static Node addTwoNumbers ( Node l1, Node l2 ) {
        Node temp = new Node(0);
        Node currentNode = temp;
        int carry = 0;

        while (l1 != null || l2 != null){
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = carry + x + y;

            carry = sum / 10;
            currentNode.next = new Node(sum % 10);
            currentNode = currentNode.next;

            if( l1 != null) l1 = l1.next;
            if( l2 != null) l2 = l2.next;
        }
        if(carry > 0) {
            currentNode.next = new Node(carry);
        }
        return temp.next;
    }

    public static void main ( String[] args ) {
        int[] l1Arr = {2, 4, 3};
        int[] l2Arr = {5, 6, 4};
        Node l1 = createLinkedList(l1Arr);
        Node l2 = createLinkedList(l2Arr);

        Node result = addTwoNumbers(l1, l2);
        printList(result);

    }

    private static void printList ( Node node ) {
        while(node != null){
            System.out.print(node.val);
            if(node.next != null) System.out.print("-> ");
            node = node.next;
        }
        System.out.println();
    }

}
