package com.goutham.dsa.linkedlist.dll;

public class DoublyLinkedList {
     ListNode head;

     public void insertBeginning(int data){
         ListNode node=new ListNode(data);
         if(head==null)
             head=node;
         else {
             node.next=head;
             head.prev=node;
             node.prev=null;
         head=node;
     }}

     public void print(){
         ListNode temp=head;
         while (temp!=null){
             System.out.print(temp.data+"->");
             temp=temp.next;
         }
         System.out.println("null");
     }
}
