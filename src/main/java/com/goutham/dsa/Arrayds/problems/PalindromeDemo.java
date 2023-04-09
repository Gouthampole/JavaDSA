package com.goutham.dsa.Arrayds.problems;

public class PalindromeDemo {
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
    }
    public static boolean isPalindrome(String str){
        char[] charArray=str.toCharArray();
        int start=0,end=str.length()-1;
        while(start<end){
            if(charArray[start]!=charArray[end])
                return false;
            start++;
            end--;
        }
        return true;
    }
}
