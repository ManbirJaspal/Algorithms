package com.Manbir.arraysandstrings.exercise1;

public class Q2 {
    //Write a function that when given an integer array prints only the negative entries

    public static void main(String[] args) {

        int[] arr1 = new int[]{1,23,4,0,-1,-2,-5,3,2,5,7,-7,-9,-5};
        printneg(arr1);

    }

    public static void printneg(int[] arr) {
        if ((arr == null) || (arr.length == 0)){
            System.out.println("empty array");
        }
        for(int arrs: arr) {
            if (arrs < 0) {
                System.out.println(arrs);
            }
        }
    }
}
