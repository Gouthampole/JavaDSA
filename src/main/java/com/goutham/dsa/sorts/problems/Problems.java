package com.goutham.dsa.sorts.problems;

import com.goutham.dsa.sorts.insertionsort.InsertionSortDemo;

public class Problems {

    public int[] mergeTwoSorted(int[] a,int[] b){
        int[] res=new int[a.length+b.length];
        int i=0,j=0,k=0;
        while (i<a.length && j< b.length){
            if(a[i]<b[j]){
                res[k]=a[i];
                i++;
            }
            else {
                res[k]=b[j];
                j++;
            }
            k++;
        }
        while (i<a.length){
            res[k]=a[i];
            i++;k++;
        }
        while (j< b.length){
            res[k]=b[j];
            j++;k++;
        }
        return res;
    }

    public void print(int[] arr){
        for(int a:arr)
            System.out.print(a+" ");
        System.out.println();
    }

    public void SortedIntoMIN_MAX(int[] arr){
        int maxIdx=arr.length-1;
        int minIdx=0;
        int max=arr[maxIdx]+1;
        for(int i=0;i<arr.length;i++) {
            if (i % 2 == 0) {
                arr[i] += (arr[maxIdx] % max) * max;
                maxIdx--;
            } else {
                arr[i] += (arr[minIdx] % max) * max;
                minIdx++;
            }
        }
        for (int i=0;i<arr.length;i++)
            arr[i]/=max;

    }
    public static void main(String[] args) {
        Problems p=new Problems();
        InsertionSortDemo demo=new InsertionSortDemo();
        int[] arr1={2,3,5,10};
        int[] arr2={4,6,11,15};
        int[] arr3={5,3,2,8,1,6};
        demo.sort(arr3);
        p.print(arr3);
        p.SortedIntoMIN_MAX(arr3);
        p.print(arr3);
    }
}
