package com.goutham.dsa.linkedlist.dll;

public class ListNode{
     int data;
     ListNode next;
     ListNode prev;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getPrev() {
        return prev;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }

    public ListNode(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
