package com.Manbir.arraysandstrings.exercise2;

import java.util.ArrayList;

public class Q6 {
//    Write a function that takes in an Integer array and returns a list of indexes where null is present.

    public static void main(String[] args) {
        Integer[] al1 = new Integer[] {1,23,2,1,3,null,4,3,null, null, 23,null};
       getNullIndex(al1);
    }

    public static ArrayList<Integer> getNullIndex(Integer[] al) {
        ArrayList<Integer> nullIndexList = new ArrayList<Integer>();
        for (int i = 0; i < al.length ; i++) {
            if (al[i] == null) {
                nullIndexList.add(i);
                System.out.println(i);
            }
    }
        return nullIndexList;
    }
}
