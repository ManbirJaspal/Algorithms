package com.Manbir.arraysandstrings.exercise1;

public class Q1 {

    public static void main(String[] args) {

//        int[] arr1 = new int[] {1,2,3,4,5,6,7,8};
        int[] arr1 = new int[] {};
        System.out.println("The total is " + arraySum(arr1));
    }

    private static int arraySum(int[] arr) {
        if ((arr == null) || (arr.length == 0)){
            return -1;
        }
       int sum = 0;
        for (int arrays: arr) {
            sum += arrays;
        }
        return sum;
    }
}
