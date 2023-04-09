package com.goutham.dsa.sorts.selectionsort;

import com.goutham.dsa.sorts.insertionsort.InsertionSortDemo;

public class SelectionSortDemo {

    public void sort(int[] arr){

        for (int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min])
                    min=j;
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }

    public void print(int[] arr){
        for(int a:arr)
            System.out.print(a+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        SelectionSortDemo demo=new SelectionSortDemo();
        int[] arr={4,6,9,3,7,5,2};
        demo.print(arr);
        demo.sort(arr);
        demo.print(arr);
    }
}
