package com.testing;

import java.util.Scanner;

public class ThursdayWhile {
    public static void main(String[] args) {
        for(int i=1 ; i<=7; i++){
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            for(int k = i ; k<=7 ; k++)
                System.out.print(k + " ");
            System.out.println();
        }
        for(int i= 7-1; i>=1; i--){
            for(int j =2; j<=i ; j++){
                System.out.print(" ");
            }
            for(int k= i; k<=7 ; k++){
                System.out.print(k + " ");

            }
            System.out.println();
        }
    }
}
