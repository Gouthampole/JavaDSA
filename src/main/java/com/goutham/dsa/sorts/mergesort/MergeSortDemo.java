package com.goutham.dsa.sorts.mergesort;

import java.util.Arrays;

public class MergeSortDemo {

    public void sort(int[] arr, int[] temp,int low,int high){
        if(low<high){
            int mid=low-(low-high)/2;
            sort(arr,temp,low,mid);
            sort(arr,temp,mid+1,high);
            merge(arr,temp,low,mid,high);
        }
    }

    public void merge(int[] arr,int[] temp,int low, int mid, int high){
        for (int i=low;i<=high;i++)
            temp[i]=arr[i];
        int i=low,j=mid+1,k=low;
        while (i<=mid && j<=high){
            if(temp[i]<=arr[j]){
                arr[k]=temp[i];
                i++;
            }
            else {
                arr[k]=temp[j];
                j++;
            }
            k++;
        }
        while (i<=mid){
            arr[k]=temp[i];
            i++;k++;
        }
    }

    public void print(int[] arr){
        for(int a:arr)
            System.out.print(a+" ");
        System.out.println();
    }

    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void dutchProblem(int[] arr){
        int i=0,j=0,k=arr.length-1;
        while (i<=k){
            if(arr[i]==0){
                swap(arr,i,j);
                i++;
                j++;
            } else if (arr[i]==1) {
                i++;
            }
            else {
                swap(arr,i,k);
                k--;
            }
        }
    }

    public static void main(String[] args) {
        MergeSortDemo demo=new MergeSortDemo();
        int[] arr={1,0,0,2,0,1,2,1};
        int[] temp=new int[arr.length];
        demo.print(arr);
        demo.dutchProblem(arr);
        demo.print(arr);
    }
}
