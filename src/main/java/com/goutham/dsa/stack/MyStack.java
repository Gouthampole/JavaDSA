package com.goutham.dsa.stack;

import java.util.Stack;

public class MyStack {
    private ListNode top;

    public void push(int data){
        ListNode node=new ListNode(data);
        node.setNext(top);
        top=node;
    }

    public void pop(){
        top=top.getNext();
    }
    public void display(){
        ListNode temp=top;
        while (temp!=null){
            System.out.print(temp.getData()+"->");
            temp=temp.getNext();
        }
        System.out.println("null");
    }
    public int peek(){
        return top.getData();
    }

    public String strReverse(String str){
        char[] chars=str.toCharArray();
        Stack<Character> stack=new Stack<>();
        for(char ch:chars)
            stack.push(ch);
        for(int i=0;i<str.length();i++)
            chars[i]= stack.pop();
        return new String(chars);
    }

    public int[] nextGreaterElement(int[] arr){
        Stack<Integer> stack=new Stack<>();
        int[] res=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            if(!stack.isEmpty()){
                while (!stack.isEmpty() && stack.peek()<=arr[i])
                    stack.pop();
            }
            if(stack.isEmpty())
                res[i]=-1;
            else
                res[i]=stack.peek();
            stack.push(arr[i]);
        }
        return res;
    }

    public boolean isValidParenthesis(String str){
        char[] chars=str.toCharArray();
        Stack<Character> stack=new Stack<>();
        for(char ch: chars){
            if(ch=='('|| ch=='{'||ch=='[')
                stack.push(ch);
            else {
                if (stack.isEmpty())
                    return false;
                else {
                    if((ch=='}' && stack.peek()=='{')||
                    (ch==']' && stack.peek()=='[')||
                    (ch==')' && stack.peek()=='(')){
                        stack.pop();
                    }
                    else return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
