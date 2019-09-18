package com.testing;

public class WhileLoop2 {
    public static void main(String[] args) {
        int i= 20;
        while(i<=150) {
            if (i%4==0) {
                System.out.println(i);
                System.out.println("-");

            }
            i++;
        }
        System.out.println();
        //This is for last "-" sign to  delete (after number 148)
    }
}
