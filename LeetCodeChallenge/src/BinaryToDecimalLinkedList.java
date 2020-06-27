public class BinaryToDecimalLinkedList {
    public int getDecimalValue(ListNode head) {

        if (head == null) {
            return 0;
        }
        // first calculate the length
        int len = getLength(head);
        int sum = 0;
        int i = 0;
        while (head != null) {
            sum += head.val * Math.pow(2, (len - 1));
            len--;
        }
        return sum;
    }

    public int getLength(ListNode head) {

        if (head == null) {
            return 0;
        }
        int length = 0;

        while (head != null) {
            length++;
            head = head.next;
        }
        return length;

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
