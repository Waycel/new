package com.testing;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner guess= new Scanner(System.in);
        int number = 25;
        System.out.println("Please enter a number");
        int enter= guess.nextInt();
        if(enter==number) {
            System.out.println("Congrats");
        }
        else if(enter>number){
            System.out.println("Larger, try again");

        }
        else {
            System.out.println("Smaller, try again");
        }
    }
}
