package DataStructures;

public class ReverseLinkedList {

    public static void main(String[] args) {
        //12345;
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        head.next = second;
        ListNode third = new ListNode(3);
        second.next = third;
        ListNode fourth = new ListNode(4);
        third.next = fourth;
        ListNode fifth = new ListNode(5);
        fourth.next = fifth;
        fifth.next = null;

        ReverseLinkedList rlist = new ReverseLinkedList();
        ListNode reverseList = rlist.reverseList(head);
        while (reverseList != null){
            System.out.println(reverseList.val);
            reverseList = reverseList.next;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode futr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = futr;
        }
        return prev;
    }
}
