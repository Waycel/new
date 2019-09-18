package com.testing;

public class PyramidWhile {
    public static void main(String[] args) {
        int lines= 1;
        int limit=7;
        int numberOfStars=1;
        while(lines <8) {
            //int limit=7;
            int spaces= limit;
            while(spaces>1) {
                System.out.print(" ");
                spaces--;
            }

            int stars=1;
            while(stars<=numberOfStars) {
                System.out.print("*");
                stars++;

            }

            System.out.println();
            lines++;
            limit--;
            numberOfStars=numberOfStars+2;
        }
    }
}
