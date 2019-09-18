/*
90+ AA
80-90 BB
70-80 CC
70- F
 */

package MyExamples;

import java.util.Scanner;

public class ifElse2 {
    public static void main(String[] args) {
        System.out.println("Lütfen notunuzu giriniz");
        Scanner s= new Scanner(System.in);
        int i=s.nextInt();
        if( i>=90){
            System.out.println("Notunuz : AA");
        }
        else if ( i>=80 ){
            System.out.println("Notunuz : BB");
        }
        else if( i>=70) {
            System.out.println("Notunuz : CC");
        }
        else {
            System.out.println("Notunuz : F");
        }

    }
}
