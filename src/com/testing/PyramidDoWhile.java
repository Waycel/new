package com.testing;

public class PyramidDoWhile {
    public static void main(String[] args) {
        int lines=1;
        do {
            int spaces=11;
            do {
                System.out.print(" ");
                spaces--;
            }while(spaces>lines);
            int stars=1;
            do {
                System.out.print("*");
                stars++;
            }while(stars<=2*lines-1);

            System.out.println();
            lines++;
        }while(lines<11);
    }

}
