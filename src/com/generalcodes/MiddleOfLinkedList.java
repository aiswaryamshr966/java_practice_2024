package com.generalcodes;

public class MiddleOfLinkedList {
    Node head;
    static class Node{
        int value;
        Node next;

        Node(int item){
            value = item;
            next = null;
        }
    }

    public static void main(String[] args) {
        MiddleOfLinkedList linkedList = new MiddleOfLinkedList();
        linkedList.head = new Node(1);

        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        linkedList.head.next = second;
        second.next = third;
        third.next = fourth;

        Node pointer = linkedList.head;
        System.out.print("LinkedList : ");
        while (pointer.next!=null){
            System.out.print(pointer.value+"->");
            pointer = pointer.next;
        }

        Node ptr1 = linkedList.head;
        Node ptr2 = linkedList.head;

        while (ptr1.next!=null){
            ptr1 = ptr1.next;
            if (ptr1.next!=null){
                ptr1 = ptr1.next;
                ptr2 = ptr2.next;
            }
        }

        System.out.println("Middle Element: "+ptr2.value);
    }
}
