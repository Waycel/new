package com.testing;

import java.sql.SQLOutput;

public class NumberToString {
    public static void main(String [] args) {
        String number = "one";
        int numInt=0;
        switch (number) {
            case "zero": numInt=0;
            break;
            case "one": numInt=1;
            break;
            case"two": numInt=2;
            break;
            case"three": numInt=3;
            break;
            case"four": numInt=4;
            break;
            case"five": numInt=5;
            break;
            case"six": numInt=6;
            break;
            case"seven": numInt=7;
            break;
            case"eight": numInt=8;
            break;
            case"nine": numInt=9;
            break;
            default:
                System.out.println("invalid");
                break;


        }
        System.out.println(numInt);
    }
}
