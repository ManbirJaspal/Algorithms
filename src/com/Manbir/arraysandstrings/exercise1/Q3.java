package com.Manbir.arraysandstrings.exercise1;

public class Q3 {
//    Write a function that when given a char array replaces all ‘b’s with ‘9’s

    public static void main(String[] args) {
        char[] arr = new char[] {'a','B','e','d','e','b','r','b'};
        replaceB(arr);
    }

    public static void replaceB(char[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            if (Character.toLowerCase(arr1[i]) == 'b') {
                arr1[i] = '9';
            }
        }
        System.out.println(arr1);
    }
}
