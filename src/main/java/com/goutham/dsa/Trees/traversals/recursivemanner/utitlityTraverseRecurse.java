package com.goutham.dsa.Trees.traversals.recursivemanner;

import com.goutham.dsa.Trees.BinaryTree.TreeNode;

public class utitlityTraverseRecurse {
    public void preOrder(TreeNode root){
        if(root==null)
            return;
        System.out.print(root.getData()+" ");
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    public void postOrder(TreeNode root){
        if(root==null)
            return;
        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.print(root.getData()+" ");
    }
    public void inOrder(TreeNode root){
        if(root==null)
            return;
        inOrder(root.getLeft());
        System.out.print(root.getData()+" ");
        inOrder(root.getRight());
    }
}
