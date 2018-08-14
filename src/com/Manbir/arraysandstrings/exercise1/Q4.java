package com.Manbir.arraysandstrings.exercise1;

public class Q4 {
//    Write a function that when given a string array outputs “police” when it encounters “cop” and “robber” when it encounters “thief”

    public static void main(String[] args) {

        String[] str = new String[]{"cop", "thief"};
        funcQ4(str);
    }

    public static void funcQ4(String[] arr) {
        for (String str : arr) {
            if (str.equals("cop")) {
                System.out.println("police");
            }
            if (str.equals("thief")) {
                System.out.println("robber");
            }
        }
    }
}
