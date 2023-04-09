package com.goutham.dsa.stack;

public class Main {
    public static void main(String[] args) {
        MyStack stack=new MyStack();
        stack.push(10);
        stack.push(30);
        stack.push(20);
        stack.pop();
        stack.display();
        System.out.println(stack.strReverse("ABCD"));
        int[] res=stack.nextGreaterElement(new int[]{4,7,3,4,8,1});
        for (int val:res)
            System.out.print(val+" ");

        System.out.println(stack.isValidParenthesis("{[()]}"));
    }

}
