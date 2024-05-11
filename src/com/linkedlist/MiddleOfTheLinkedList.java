package com.linkedlist;

class LinkedList{
    int value;
    ListNode next;
    public LinkedList(int value){
        this.value = value;
    }
}

public class MiddleOfTheLinkedList {
    public static void main(String[] args) {
        ListNode ll = new ListNode(1);
        ll.next = new ListNode(2);
        ll.next.next = new ListNode(3);
        ll.next.next.next = new ListNode(4);
        ll.next.next.next.next = new ListNode(5);
        ll.next.next.next.next.next = new ListNode(6);

        System.out.println("Middle of the LinkedList: "+findMiddle(ll).value);
    }

    private static ListNode findMiddle(ListNode ll) {
        if (ll==null) return null;

        ListNode slow = ll;
        ListNode fast = ll;

        //Move the fast pointer two steps and slow pointer one step at a time
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
