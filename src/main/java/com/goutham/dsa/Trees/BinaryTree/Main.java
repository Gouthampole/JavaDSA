package com.goutham.dsa.Trees.BinaryTree;

import com.goutham.dsa.Trees.traversals.iterativemanner.utilityTraverseIter;
import com.goutham.dsa.Trees.traversals.recursivemanner.utitlityTraverseRecurse;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        utilityTraverseIter traverse = new utilityTraverseIter();
        utitlityTraverseRecurse recurseTraverse=new utitlityTraverseRecurse();
        tree.insert(7);
        tree.insert(3);
        tree.insert(10);
        tree.insert(2);
        tree.insert(5);
        tree.insert(12);
        traverse.preOrder(tree.getRoot());
        boolean val=tree.isValidBinarySearchTree(tree.getRoot(),Integer.MIN_VALUE,Integer.MAX_VALUE);
        System.out.println(val);
    }
}
