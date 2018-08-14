package com.Manbir.arraysandstrings.exercise1.exercise2;

public class Q7 {
//    Given a string, count how many times each character shows up in the string.

    public static void main(String[] args) {
        String str = "ajbdkhjabckjhwbckjwcbkjwbcnwckjwebcwjebckwjec";
        char temp;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            temp = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                if (temp == str.charAt(j)) {
                    count++;
                }
            }
            System.out.println("The character " + temp + " is repeated " + (count - 1) + " times");
            count = 0;

        }
    }

}
