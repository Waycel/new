package com.testing;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DriverLcence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Age");
        int age = scanner.nextInt();
        if(age>=16) {
            System.out.println("F for first time, R for Renew");
            String reason = scanner.next();
            if(reason.equals("F")) {
                System.out.println("ID, photo, form");
            }
            else if (reason.equals("R")) {
                System.out.println("Old Driwing Licence");
            }
            else {
                System.out.println("Please F or R");
            }
        }
        else {
            System.out.println("You can not apply");
        }

    }
}
