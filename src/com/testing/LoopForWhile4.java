package com.testing;

public class LoopForWhile4 {
    public static void main(String[] args) {
        char letter='a';

        for(int i= 1; i<7; i++) {
            System.out.printf("%6d |" ,i);
            int count=1;
            while(count<5) {
                System.out.printf("%4s",letter);
                count++;
                letter++;
                //System.out.print(" " +(int) letter);
            }
            System.out.println();
        }
    }
}
