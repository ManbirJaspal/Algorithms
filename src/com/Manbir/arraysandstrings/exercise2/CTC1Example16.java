package com.Manbir.arraysandstrings.exercise2;

public class CTC1Example16 {

    public static void main(String[] args) {
        int n = 50;
        pOf2(n);
    }

    public static int pOf2(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int prev = pOf2(n/2);
            int curr = prev * 2;
            System.out.println(curr);
            return curr;
        }
    }
}
