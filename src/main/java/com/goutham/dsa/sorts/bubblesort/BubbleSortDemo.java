package com.goutham.dsa.sorts.bubblesort;

public class BubbleSortDemo {
    public void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return ;
    }

    public void printArr(int[] arr){
        for (int a:arr)
            System.out.print(a+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        BubbleSortDemo demo=new BubbleSortDemo();
        int[] arr={2,5,1,6,3,7};
        demo.printArr(arr);
        demo.sort(arr);
        demo.printArr(arr);
    }

}
