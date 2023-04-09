package com.goutham.dsa.sorts.insertionsort;

public class InsertionSortDemo {
    public void sort(int[] arr){
    for (int i=1;i<arr.length;i++){
        int temp=arr[i];
        int j=i-1;
        while (j>=0 && arr[j]>temp){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=temp;
    }
    }

    public void print(int[] arr){
        for(int a:arr)
            System.out.print(a+" ");
        System.out.println();
    }
    public static void main(String[] args) {
    InsertionSortDemo demo=new InsertionSortDemo();
    int[] arr={4,6,1,3,7,5};
    demo.print(arr);
    demo.sort(arr);
    demo.print(arr);
    }
}
