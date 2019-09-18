package com.testing;

public class StringComparison {
    public static void main(String [] args) {
        String check1 = "a";
        String check2 = "a";
        System.out.println(check1.compareTo(check2));
        if(check1.compareTo(check2)==0) {
            System.out.println("They are equal");
        }

    }
}
