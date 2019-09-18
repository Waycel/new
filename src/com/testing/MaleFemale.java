package com.testing;
import java.util.Scanner;
public class MaleFemale {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter F or M");
        String gender = scanner.next();
        if (gender.equals("M")) {
            System.out.println("Male");
        }
        else {
            System.out.println("Female");
        }
    }
}
