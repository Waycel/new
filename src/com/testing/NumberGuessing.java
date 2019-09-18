package com.testing;

import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        int numberToGuess= 101;
        Scanner numberInput= new Scanner(System.in);
        System.out.println("Guess :");
        int userNumber = numberInput.nextInt();
        int start =0;
        while (start<5) {
            if (userNumber==numberToGuess) {
                System.out.println("CONGRATS!!!");
            } else if(userNumber>numberToGuess) {
                System.out.println("Larger. Try again");
            } else {
                System.out.println("Smaller. Try again");
            }
            //start++;

        }

    }
}
