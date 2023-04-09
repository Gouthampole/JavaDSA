package com.goutham.dsa.Arrayds.problems;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[]={2,8,1,4,3,7,6};
        System.out.println(MissingEleInArray(arr));
    }

    public static int MissingEleInArray(int[] arr){
        int n= arr.length+1;
        int sum=(n*(n+1))/2;
        for (int a:arr)
            sum-=a;
        return sum;
    }
}
