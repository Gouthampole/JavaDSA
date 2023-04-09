package com.goutham.dsa.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    private ListNode rear;
    private ListNode front;

    public void enqueue(int data){
        ListNode node=new ListNode(data);
        if(rear==null)
            front=node;
        else
        {
            rear.setNext(node);
        }
        rear=node;
    }

    public void dequeue(){
        if(front==null)
            System.out.println("no elements to delete..");
        else
            front=front.getNext();
    }

    public void display(){
        if(rear==null|| front==null)
            System.out.println(" empty queue");
        else {
            ListNode temp = front;
            while (temp!=rear){
                System.out.print(temp.getData()+"->");
                temp=temp.getNext();
            }
            System.out.println(temp.getData()+"->null");
        }
    }

    public String[] genBinaryUpTo(int n){
        String[] res=new String[n];
        Queue<String> queue=new LinkedList<>();
        queue.offer("1");
        for(int i=0;i<n;i++){
            res[i]=queue.poll();
            String a=res[i]+"0";
            String b=res[i]+"1";
            queue.offer(a);
            queue.offer(b);
        }
        queue.clear();
        return res;
    }
}
