package com.testing;

public class LoopForWhile3 {
    public static void main(String[] args) {
        char letter='a';
        for(int i=1; i<6; i++){
            System.out.print(i);

            int count=1;
            while(count<5) {
                System.out.print(letter);
                count++;
                letter++;
                //System.out.print(" "+(int) letter);

            }
            System.out.println();
        }
    }
}
