package com.testing;

public class UpSideDownTriangleWhile {
    public static void main(String[] args) {
        int outer = 1;
        int limitInner=10;
        while(outer<10){
            int spaces=1;
            while (spaces<outer){
                System.out.print("  ");
                spaces++;
            }

            int inner = 1;
            while(inner<limitInner) {
                System.out.print("* ");
                inner++;
            }
            limitInner--;
            System.out.println();
            outer++;
        }
    }

}