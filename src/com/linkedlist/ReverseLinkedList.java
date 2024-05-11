package com.linkedlist;

import java.util.List;

class ListNode {
    int value;
    ListNode next;

    public ListNode(int value){
        this.value = value;
    }
}
public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode ll = new ListNode(1);
        ll.next = new ListNode(2);
        ll.next.next = new ListNode(3);
        ll.next.next.next = new ListNode(4);
        ll.next.next.next.next = new ListNode(5);
        ll.next.next.next.next.next = new ListNode(6);

        System.out.println("Before Reversing");
        printLinkedList(ll);
        System.out.println();

        System.out.println("After Reversing");
        ListNode newListNode = reversedLinkedList(ll);
        printLinkedList(newListNode);
    }

    private static ListNode reversedLinkedList(ListNode ll) {
        ListNode previous = null;
        ListNode current = ll;
        ListNode next;

        while (current!=null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }

    private static void printLinkedList(ListNode ll) {
        ListNode current = ll;
        while(current!=null){
            System.out.print(current.value+"->");
            current = current.next;
        }
    }

}
