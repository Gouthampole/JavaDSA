package com.goutham.dsa.Arrayds.problems;

import java.util.ArrayList;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr={2,0,7,0,4,4,0};
        print(own(arr));
        print(moveZerosTOEnd(arr));
        arr=resizeCapacity(arr,10);
        System.out.println(arr.length);
    }

    public static int[] moveZerosTOEnd(int[] arr){
        //j is for zero and i is for non zero, when j value not equal to o, increment the j value
        int j=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0)
                j++;
        }
        return arr;
    }

    public static int[] own(int[] arr){
        int[] res=new int[arr.length];
        int zeroCount=0;
        int j=0;

        for (int a:arr){
            if(a==0)
                zeroCount++;
        }
        for (int a:arr)
            if(a!=0){
                res[j]=a;
                j++;
            }
        while(zeroCount==0){
            res[j]=0;
            j++;
            zeroCount--;
        }

        return res;
    }

    public static void print(int[] arr){
        for(int a:arr)
            System.out.print(a+" ");
        System.out.println();
    }

    public static int[] resizeCapacity(int[] arr,int capacity){
        int[] temp=new int[capacity];
        for (int i=0;i<arr.length;i++)
            temp[i]=arr[i];
        arr=temp;
        return arr;
    }

}
