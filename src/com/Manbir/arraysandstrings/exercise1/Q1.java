package com.Manbir.arraysandstrings.exercise1;

public class Q1 {

    public static void main(String[] args) {

        int[] arr1 = new int[] {1,2,3,4,5,6,7,8};
        System.out.println("The total is " + arraySum(arr1));
    }

    private static int arraySum(int[] arr) {
       int sum = 0;
        for (int arrays: arr) {
            sum += arrays;
        }
        return sum;
    }
}
