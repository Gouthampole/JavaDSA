package com.goutham.dsa.search;

public class LinearSearch {
    public static void search(int[] arr,int value){
        for (int i=0;i<arr.length;i++)
            if (arr[i]==value){
                System.out.println("element found");
                return;
            }
        System.out.println("not found");
    }

    public static void main(String[] args) {
        search(new int[]{1,3,2,5,7,4},10);
    }
}
