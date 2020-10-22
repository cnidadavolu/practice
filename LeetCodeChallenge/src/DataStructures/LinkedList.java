package DataStructures;


/*
Implementing LinkedList
 */
public class LinkedList {
    Node head;

    public static void main(String[] args) {
        //Create a linked list that accepts 5 values and print in the same order
        LinkedList llist = new LinkedList();
        llist.head = new Node(1);

        Node second = new Node(2);
        llist.head.next = second; // pointing reference of the second node to the first Node

        Node third = new Node(3);
        second.next = third; // pointing reference of third element to the second node

        Node fourth = new Node(4);
        third.next = fourth; // pointing reference of fourth element to the Third node

        Node fifth = new Node(5);
        fourth.next = fifth;

        llist.printLinkedList();

    }

    //traverse Linkedlist and print LinkedList values
    public void printLinkedList() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
}
