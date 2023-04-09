package com.goutham.dsa.generalprobsTables;

public class searchRowCol {
    public static int[][] giveArray(){
        int[][] arr={
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,51}
        };
        return arr;
    }

    public static int lengthArr(int[][] arr){
        return arr[0].length;
    }
    public static void searchElement(int[][] arr,int ele){
        int n=lengthArr(arr);
        int i=0,j=n-1;
        while (i<n && j>=0){
            if(arr[i][j]==ele) {
                System.out.println("element found at row:" + i + " and column:" + j);
                return;
            }
            if(ele>arr[i][j])
                i++;
            else
                j--;
        }
        System.out.println(ele+"not found");
    }

    public static void printSpiral(int[][] arr,int r,int c){
    int a=0,b=0;
    while (a<r && b<c){
        for (int i=b;i<c;i++)
            System.out.print(arr[a][i]+" ");
        a++;
        for (int i=a;i<r;i++)
            System.out.print(arr[i][c-1]+" ");
        c--;
        if (a<r){
            for (int i=c-1;i>=b;i--)
                System.out.print(arr[r-1][i]+" ");
     r--;
    }
        if (b<c){
            for (int i=r-1;i>=a;i--)
                System.out.print(arr[i][b]+" ");
            b++;
        }
    }
    }
    public static void main(String[] args) {
        searchElement(giveArray(),37);
        printSpiral(giveArray(),lengthArr(giveArray()),lengthArr(giveArray()));
    }
}
