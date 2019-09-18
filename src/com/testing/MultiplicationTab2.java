package com.testing;
import java.util.Scanner;
public class MultiplicationTab2 {
        public static void main(String[] args) {
            Scanner readKey = new Scanner(System.in);
            System.out.print("Please enter multiplicand : ");
            int multiplicand = readKey.nextInt();
            System.out.print("Please enter multiplier : ");
            int multiplier = readKey.nextInt();
            System.out.println("\t  1   2   3   4   5   6   7   8   9");
            System.out.println("\t  ---------------------------------");
            for (int i=1; i<=multiplicand; i++)
            { System.out.print(i+" :");
                for (int j=1; j<=multiplier; j++) {
                    System.out.printf("%4d",i*j); }

                System.out.println("\n");
            }
        }
    }
