public class MiddleOfLinkedList {

    public static Node middleNode(Node head) {
        Node slow_ptr = head;
        Node fast_ptr = head;

        if (head != null) {
            while (fast_ptr != null && fast_ptr.next != null) {
                slow_ptr = slow_ptr.next;
                fast_ptr = fast_ptr.next.next;
            }
        }
        return slow_ptr;
    }

    public static void main(String[] args) {

        int[] input = {1, 2, 3, 4, 5};
        Node llist = null;
        for (int i : input) {
            llist = new Node(i);
        }
        System.out.println(middleNode(llist));
    }

    //implementing single linked list
    public static class Node {
        int val;
        Node next;

        Node(int x) {
            val = x;
        }
    }
}
