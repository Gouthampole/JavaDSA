package com.goutham.dsa.Arrayds.problems;

//corner cases should be considered...
public class MinMaxDemo {
    public static void main(String[] args) {
        int[] arr={2,5,4,6,0,8,1};
        int maxValue=maxValue(arr);
        System.out.println("Max:"+maxValue);

        int minValue=minValue(arr);
        System.out.println("Min:"+minValue);

        int secondMin=secondMin(arr);
        System.out.println("second min:"+secondMin);

        int secondMax=secondMax(arr);
        System.out.println("second max:"+secondMax);

    }

    public static int minValue(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int a:arr){
            if(a<min)
                min=a;
        }
        return min;
    }

    public static int maxValue(int[] arr){
        int max=Integer.MIN_VALUE;
        for (int a:arr)
            if(a>max)
                max=a;
        return max;
    }

    public static int secondMin(int[] arr){
        int min=Integer.MAX_VALUE;
        int secondMinVal=0;
        for(int a:arr){
            if (a<min) {
                secondMinVal=min;
                min = a;
            } else if (a<secondMinVal && a!=min) {
                secondMinVal=a;

            }
        }
        return secondMinVal;
    }
    public static int secondMax(int[] arr){
        int max=Integer.MIN_VALUE;
        int secondMaxVal=0;
        for(int a:arr){
            if (a>max) {
                secondMaxVal=max;
                max = a;
            }
            else if (a>secondMaxVal && a!=max)
                secondMaxVal=a;
        }
        return secondMaxVal;
    }

}
