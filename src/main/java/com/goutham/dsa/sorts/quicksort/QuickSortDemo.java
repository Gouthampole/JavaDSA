package com.goutham.dsa.sorts.quicksort;

public class QuickSortDemo {

    public void sort(int[] arr, int low,int high){
        if(low>=high)
            return;
        int s=low;
        int e=high;
        int mid=s+(e-s)/2;
        int pivot=arr[mid];

        while (s<=e){
            while (arr[s]<pivot){
                s++;}
            while (arr[e]>pivot){
                e--;}
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;e--;
            }
        }
        sort(arr,low,e);
        sort(arr,s,high);
    }
    public void print(int[] arr){
        for(int a:arr)
            System.out.print(a+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        QuickSortDemo demo=new QuickSortDemo();
        int[] arr={5,1,3,8,4};
        demo.print(arr);
        demo.sort(arr,0, arr.length-1);
        demo.print(arr);

    }
}
