package com.testing;

public class LoopForWhile1 {
    public static void main(String[] args) {
        for(int i=1; i<6; i++) {
            System.out.print(i);
            char letter ='a';
            for (int j=1; j<15; j++){
                System.out.print(letter);
                letter++;
            }
        }
        System.out.println();
    }

}