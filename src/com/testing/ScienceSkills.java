package com.testing;
import java.util.Scanner;
public class ScienceSkills {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your skill? Java/SQL/Cloud");
        String skill = scanner.next();
        if (skill.equalsIgnoreCase ("Java")) {
            System.out.println("QA score");
            int qaScore = scanner.nextInt();
            if (qaScore>=60) {
                System.out.println("Accepted");
            }
            else {
                System.out.println("Not Accepted");
            }
        }
        else if (skill.equals("SQL")) {
            System.out.println("Hackerrenk Score?");
            int hrscore = scanner.nextInt();
            if(hrscore>=400) {
                System.out.println("Good");
            }
            else if (hrscore>300 && hrscore<400) {
                System.out.println("Not Bad");
            }
            else {
                System.out.println("No Comment");
            }
        }
        else {
            System.out.println("Certification?");
            String cert= scanner.next();
            if(cert.equals("Y")|| cert.equalsIgnoreCase("yes")) {
                System.out.println("Good Job");
            }
            else {
                System.out.println("That is fine");
            }

        }

    }
}
