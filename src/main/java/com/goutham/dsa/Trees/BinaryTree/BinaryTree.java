package com.goutham.dsa.Trees.BinaryTree;

import java.util.List;

public class BinaryTree {
    private TreeNode root;
    
    public TreeNode createTree(){
        TreeNode node1=new TreeNode(1);
        TreeNode node2=new TreeNode(2);
        TreeNode node3=new TreeNode(3);
        TreeNode node4=new TreeNode(4);
        TreeNode node5=new TreeNode(5);
        TreeNode node6=new TreeNode(6);
        TreeNode node7=new TreeNode(7);
        root=node1;
        node1.setLeft(node2);node1.setRight(node3);
        node2.setLeft(node4);node2.setRight(node5);
        node3.setLeft(node6);node3.setRight(node7);
        return root;
    }

    public void createBinarySearchTree(){
//        TreeNode node1=new TreeNode(5);
//        TreeNode node2=new TreeNode(3);
//        TreeNode node3=new TreeNode(7);
//        TreeNode node4=new TreeNode(1);

    }
    public int findMaxInTree(TreeNode root){
        if(root==null)
            return Integer.MIN_VALUE;
        TreeNode temp=root;
        int result=temp.getData();
        int left=findMaxInTree(root.getLeft());
        int right=findMaxInTree(root.getRight());
        if(left>result)
            result=left;
        if(right>result)
            result=right;
        return result;

    }

    public void insert(int value){
        root=binarySearchInsertion(root,value);
    }
    public TreeNode binarySearchInsertion(TreeNode root,int value){
        if(root==null){
            root=new TreeNode(value);
            return root;
        }
        if (value<root.getData())
            root.setLeft(binarySearchInsertion(root.getLeft(),value));
        else
            root.setRight(binarySearchInsertion(root.getRight(),value));
        return root;
    }

    public TreeNode getRoot(){
        return this.root;
    }

    //using min and max algo
    public boolean isValidBinarySearchTree(TreeNode root,int min,int max){
        if (root==null)
            return true;
        if (root.getData()>=max && root.getData()<=min)
            return false;
        boolean left=isValidBinarySearchTree(root.getLeft(),min,root.getData());
        if(left){
            boolean right=isValidBinarySearchTree(root.getRight(),root.getData(),max);
            return right;
        }
        return false;
    }
}
