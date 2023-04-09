package com.goutham.dsa.Arrayds.problems;

import java.util.Arrays;

public class ArrayReverseEx {
    public static void main(String[] args) {
        int[] arr=reverse1(new int[]{2,4,3,1,5});
        print(arr);
    }


    public static int[] sort(int[] arr){
        Arrays.sort(arr);
        return arr;
    }

    public static int[] reverse2(int[] arr){
        if(arr.length>0){
            int temp= arr.length-1;
            int start=0;
            int[] res=new int[temp+1];
           while (temp>=0){
               res[start]=arr[temp];
               start++;
               temp--;
           }
            return res;
        }
        else
            return null;
    }

    public static int[] reverse1(int[] arr){
        int start=0,end=arr.length-1;
        while (start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;end--;
        }
        return arr;
    }
    public static void print(int[] arr){
        for (int a:arr){
            System.out.print(a+" ");
        }
    }
}
