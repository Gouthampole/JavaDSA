package com.goutham.dsa.queue;

public class ListNode {
    private ListNode next;
    private int data;
    public ListNode(int data){
        this.data=data;
    }

    public ListNode getNext() {
        return next;
    }

    public int getData() {
        return data;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
