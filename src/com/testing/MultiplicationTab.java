package com.testing;

public class MultiplicationTab {
    public static void main(String[] args) {
        //Multiplication Table
        for(int i=1; i<11; i++) {
            for(int j=1; j<=10; j++) {
                System.out.print(j+ "X" + i+"=" + j*j+ " ");
                if(j==10) {
                    System.out.println();
                }
            }
        }
    }
}
