package com.goutham.dsa.search;

public class BinarySearch {
    public static void search(int[] arr,int value){
        int l=0,h=arr.length-1;
        while (l<=h){
            int mid=l-(l-h)/2;
            if (arr[mid]==value){
                System.out.println("found");return;}
            else if (value<arr[mid])
                h=mid-1;
            else if (value>arr[mid])
                l=mid+1;
        }
        System.out.println("not found");
    }

    public static void main(String[] args) {
        search(new int[]{4,1,5,2,6,3},9);
    }
}
