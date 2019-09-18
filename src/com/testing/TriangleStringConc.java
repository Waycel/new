package com.testing;

public class TriangleStringConc {
    public static void main(String[] args) {
        String star="* ";
        int count=0;
        do{
            System.out.println(star);
            star= star+ "* ";
            count++;

        }
        while(count<8);

    }
}
