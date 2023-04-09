package com.goutham.dsa.linkedlist.cll;

public class CircularLinkedList {
    ListNode last;

    public void insertEnd(int data){
        ListNode node=new ListNode(data);
        if (last==null) {
            last = node;
        }
        else {
//            node.next=last.next;
            node.setNext(last.getNext());
        }
//      last.next=node;
        last.setNext(node);
        last=node;
    }

    public void print(){
        if(last==null)
            System.out.println("no elements");
        else {
//            ListNode first=last.next;
            ListNode first=last.getNext();
            while (first!=last){
                System.out.print(first.getData()+"->");
                first=first.getNext();
            }
            System.out.println(first.getData()+"->null");
        }
    }
}
