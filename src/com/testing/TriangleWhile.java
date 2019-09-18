package com.testing;

public class TriangleWhile {
    public static void main(String[] args) {

        int x=1;
        while(x<10){
            int y=1;
            while(y<x) {
                System.out.print("* ");
                y++;

            }
            System.out.println();
            x++;
        }
    }
}
