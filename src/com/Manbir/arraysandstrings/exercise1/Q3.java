package com.Manbir.arraysandstrings.exercise1;

public class Q3 {
//    Write a function that when given a char array replaces all ‘b’s with ‘9’s

    public static void main(String[] args) {
        char[] arr = new char[] {'a','b','e','d','e','b','r','b'};
        replaceB(arr);
    }

    public static void replaceB(char[] arr1) {
        char[] chararr = arr1;
        for (int i = 0; i < chararr.length; i++) {
            if (chararr[i] == 'b') {
                chararr[i] = '9';
            }
        }
        System.out.println(chararr);
    }
}
