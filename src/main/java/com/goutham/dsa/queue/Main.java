package com.goutham.dsa.queue;

public class Main {
    public static void main(String[] args) {
        MyQueue queue=new MyQueue();
        String[] res=queue.genBinaryUpTo(5);
        for(String val:res){
            System.out.print(val+" ");
        }
    }
}
