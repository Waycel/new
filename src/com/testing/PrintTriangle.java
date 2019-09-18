package com.testing;

public class PrintTriangle {
    public static void main(String[] args) {
        for(int i=1 ; i <= 10 ;i++){
            for(int j=1 ; j<11 ; j++){
                if(j<=i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
