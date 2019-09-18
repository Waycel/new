package com.testing;

public class LeapYearNe {
    public static void main(String [] args) {
        int year = 1900;
        if(year%100==0) {
            if(year%400==0) {
                System.out.println("Leap");

            }
            else{
                System.out.println("Not");
            }
        }
        else {
            if(year%4==0) {
                System.out.println("Leap");

            }
            else {
                System.out.println("Not");
            }
        }
    }
}
