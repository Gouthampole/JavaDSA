package com.goutham.dsa.linkedlist.sll;

public class SinglyLinkedList {

    private ListNode head;
    public static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static void main(String[] args) {
//        SinglyLinkedList sll=new SinglyLinkedList();
//        sll.head=new ListNode(1);
//        ListNode second=new ListNode(2);
//        sll.head.next=second;
//        ListNode third=new ListNode(3);
//        second.next=third;
//        ListNode fourth=new ListNode(4);
//        third.next=fourth;
//        ListNode fifth=new ListNode(5);
//        fourth.next=fifth;

        SinglyLinkedList a=new SinglyLinkedList();
        a.insertAtEnd(1);
        a.insertAtEnd(3);
        a.insertAtEnd(5);
        a.print();
        SinglyLinkedList b=new SinglyLinkedList();
        b.insertAtEnd(2);
        b.insertAtEnd(8);
        b.print();

        SinglyLinkedList res=new SinglyLinkedList();
        res.head=sumOfTwoNumbersInTwoLists(a.head,b.head);
        res.print();

    }

    public void print(){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null\n");
    }
    public void print(ListNode head){
        ListNode temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public void insertBeginning(int data){
        ListNode node=new ListNode(data);
        node.next=head;
        head=node;
    }

    public void insertAtEnd(int data) {
        ListNode node = new ListNode(data);
        if (head == null) {
            head = node;
        } else {
            ListNode temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }
    public int length(){
        ListNode temp=head;
        int count=0;
        while(temp!=null) {
            count++;
            temp=temp.next;
        }
        return count;
    }
    public void insertAtPosition(int data, int position){
        int current=1;
        ListNode node=new ListNode(data);
        ListNode temp=head;
            if(position<=0 || position>length()){
                System.out.println("Cannot be inserted..");
            }
            else if (position==1)
                insertBeginning(data);
            else {
                while(current<position-1){
                    temp=temp.next;
                    current++;
                }
                node.next=temp.next;
            temp.next=node;
            }
    }

    public void deleteBeginning(){
        if(head==null)
            System.out.println("list is empty");
        else
        {
            ListNode temp=head;
            head=head.next;
            temp=null;
        }
    }

    public void deleteAtEnd(){
        ListNode temp=head;
        ListNode prev=temp;
        while(temp.next!=null) {
            prev=temp;
            temp = temp.next;
        }
        prev.next=null;
        temp=prev;
    }

    public void deleteAtPosition(int position){
        if(position==1)
            deleteBeginning();
        else if (position<=0 || position>length() || head==null)
            System.out.println("cannot be deleted");
        else
        {
            ListNode temp=head;
            int current=1;
            while (current<position-1){
                temp=temp.next;
                current++;
            }
            temp.next=temp.next.next;
//            temp.next.next=null;
        }
    }

    public ListNode reverseLinkedList(){
        ListNode next=null;
        ListNode rev=null;
        ListNode current=head;
        while (current!=null){
            next=current.next;
            current.next=rev;
            rev=current;
            current=next;
        }
        return rev;
    }

    public void findMiddle(){
        ListNode fastPtr=head;
        ListNode slowPtr=head;
        while(fastPtr!=null && fastPtr.next!=null){
            slowPtr=slowPtr.next;
            fastPtr=fastPtr.next.next;
        }
        System.out.println(slowPtr.data);
    }

    //assume in a racing scenario, refPtr started the race from n steps forward, if refPtr and mainPtr go on same speed.
//    then mainPtr will be behind the refPtr by last n.
    public void findNElementFromLast(int n){
        if(head==null){
            System.out.println("head is null");
        }
        else
        {
            ListNode refPtr=head;
            ListNode mainPtr=head;
            int count=0;
            while(count<n){
                refPtr=refPtr.next;
                count++;
            }
            while (refPtr!=null){
                refPtr=refPtr.next;
                mainPtr=mainPtr.next;
            }
            System.out.println(mainPtr.data);
        }
    }

    public void removeDataDuplicates(){
        ListNode temp=head;
        while (temp!=null && temp.next!=null ){
            if(temp.data==temp.next.data){
                temp.next=temp.next.next;
            }
           else temp=temp.next;
        }
    }

    public void insertInSortedList(int data){
        if(head==null)
            System.out.println("head is null");
        else {
            ListNode temp=head;
            ListNode node=new ListNode(data);
            while (temp!=null && temp.next!=null){
                if(temp.next.data>data){
                    node.next=temp.next;
                    temp.next=node;
                    break;
                }
                temp=temp.next;
            }
        }
    }

    public boolean detectLoop(){
        if(head==null)
            System.out.println("head is null");
        else
        {
            ListNode temp=head;
            ListNode slowPtr=head;
            while (temp!=null && temp.next!=null){
                temp=temp.next.next;
                slowPtr=slowPtr.next;
                if (slowPtr==temp)
                    return true;
            }
        }
        return false;
    }

    public ListNode detectStartingPointOfLoop(){
        ListNode fastPtr=head,slowPtr=head;
        while (fastPtr!=null && fastPtr.next!=null){
            fastPtr=fastPtr.next.next;
            slowPtr=slowPtr.next;
            if (fastPtr==slowPtr){
                return getStartingPoint(slowPtr);
            }
        }
        return null;
    }
    public ListNode getStartingPoint(ListNode slowPtr){
        ListNode temp=head;
        while (temp!=slowPtr){
            slowPtr=slowPtr.next;
            temp=temp.next;
        }
        return temp;
    }

    public static ListNode merge(ListNode a,ListNode b){
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;
        while(a!=null && b!=null){
            if(a.data<=b.data) {
                tail.next = a;
                a=a.next;
            }
            else {tail.next=b;
            b=b.next;}
            tail=tail.next;
        }
        if(a==null)
            tail.next=b;
        else tail.next=a;
        return dummy.next;
    }

    public static ListNode sumOfTwoNumbersInTwoLists(ListNode a,ListNode b){
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;
        int carry=0;
        while (a!=null ||b!=null){
            int x=(a!=null)?a.data:0;
            int y=(b!=null)?b.data:0;
            int sum=carry+x+y;
            carry=sum/10;
            tail.next=new ListNode(sum%10);
            if(a!=null) a=a.next;
            if(b!=null)b=b.next;
            tail=tail.next;
        }
        if(carry>0)
            tail.next=new ListNode(carry);
        return dummy.next;
    }

}
