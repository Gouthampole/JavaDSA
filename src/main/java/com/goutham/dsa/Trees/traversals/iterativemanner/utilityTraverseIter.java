package com.goutham.dsa.Trees.traversals.iterativemanner;

import com.goutham.dsa.Trees.BinaryTree.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class utilityTraverseIter {
    public void preOrder(TreeNode root){
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode temp=stack.pop();
            System.out.print(temp.getData()+" ");
            if(temp.getRight()!=null)
                stack.push(temp.getRight());
            if(temp.getLeft()!=null)
                stack.push(temp.getLeft());
        }
    }
    public void postOrder(TreeNode root){
        Stack<TreeNode> stack=new Stack<>();
        TreeNode current=root;
        while(!stack.isEmpty() || current!=null){
            if(current!=null)
            {
                stack.push(current);
                current=current.getLeft();
            }
            else {
                TreeNode temp=stack.peek().getRight();
                if(temp==null){
                    temp=stack.pop();
                    System.out.print(temp.getData()+" ");
                    while (!stack.isEmpty() && temp==stack.peek().getRight()){
                        temp=stack.pop();
                        System.out.print(temp.getData()+" ");
                    }
                }
                else
                    current=temp;
            }
        }
    }
    public void inOrder(TreeNode root){
        Stack<TreeNode> stack=new Stack<>();
        TreeNode temp=root;
        while (!stack.isEmpty() || temp!=null){
            if(temp!=null){
                stack.push(temp);
                temp=temp.getLeft();
            }
            else {
                temp=stack.pop();
                System.out.print(temp.getData()+" ");
                temp=temp.getRight();
            }
        }

    }
    public void levelOrder(TreeNode root){
        TreeNode temp=root;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(temp);
        while (!queue.isEmpty()){
            temp=queue.poll();
            System.out.print(temp.getData()+" ");
            if(temp.getLeft()!=null)
                queue.offer(temp.getLeft());
            if(temp.getRight()!=null)
                queue.offer(temp.getRight());
        }
    }

}
