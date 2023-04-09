package com.goutham.dsa.Arrayds.problems;

public class RemoveEvenFromArray {
    public static void main(String[] args) {
        int[] arr=removeEven(new int[]{2, 3, 4, 6, 1});
        print(arr);
    }

    public static int[] removeEven(int[] arr){
        int oddCount=0;
        for(int a:arr){
            if(a%2!=0)
                oddCount++;
        }
        int[] res=new int[oddCount];
        int j=0;
        for (int a:arr)
            if(a%2!=0){
                res[j]=a;
                j++;
            }
        return res;
    }

    public static <T> void print(int[] arr){
        for (int a:arr)
            System.out.print(a+" ");
    }
}
