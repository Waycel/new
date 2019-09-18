package com.testing;

import java.util.Scanner;

public class LoopForWhile2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number of abcd");
        int abcd= sc.nextInt();
        char d= 'a';

        for(int i =1; i<=abcd; i++) {
            System.out.print(i);

            for(int j=1; j<3; j++) {
                System.out.print(d);
                d++;
                System.out.print(d++ +(""));
            }
            System.out.println();
        }

    }
}