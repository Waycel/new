package com.testing;

public class CountDown {
    public static void main(String[] args) {
        int start1= 100;
        double start2= 99.5;
        do{
            System.out.println(start1);
            if(start2>0){
                System.out.println(start2);
            }
            start1 --;
            start2= start2-1;

        }while(start1>=0);
    }
}
