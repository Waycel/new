package com.testing;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Perimeters {
    public static void main(String [] args) {
        Scanner scanParameter = new Scanner(System.in);
        System.out.println("c for circle, R for rectangle, T for Triangle");
        String shape = scanParameter.next();
        double perimeter= 0;
        if(shape.equals("c")) {
            System.out.println("Please enter radius:");
            int radius = scanParameter.nextInt();
            perimeter = 2 * 3.14 * radius;
        }
        else if (shape.equals("R")) {
            System.out.println("Please width");
            int width = scanParameter.nextByte();
            System.out.println("Please height");
            int height = scanParameter.nextInt();
            perimeter = 2 * (width+height);

        }
        else if (shape.equals("T")) {
            System.out.println("Side1 :");
            int side1 = scanParameter.nextInt();
            System.out.println("Side2 :");
            int side2 = scanParameter.nextInt();
            System.out.println("side3 :");
            int side3 = scanParameter.nextInt();
            perimeter = side1 + side2 + side3;

        }
        else {
            System.out.println("Please enter C,R or T");
        }

        System.out.println("Perimeter is : %3f" + perimeter);

    }
}
