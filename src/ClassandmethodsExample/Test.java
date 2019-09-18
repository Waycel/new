package ClassandmethodsExample;

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        Invoices invoice=new Invoices();

        System.out.println("What is your electric consumption?");
        int consumpt=scan.nextInt();

        String myElectric= invoice.evaluateelectric(consumpt);

        System.out.println("What is your internet speed?");
        int speed=scan.nextInt();
        String myInternet= invoice.evaluateInternet(speed);

        Loans loan=new Loans();

        System.out.println("Your monthly payment?");
        int monthlyPay= scan.nextInt();
        System.out.println("Which payment as month?");
        int month= scan.nextInt();
        int mortgage= loan.calculateMortgage(month, monthlyPay);

        System.out.println("What is your car total price?");
        int carPrice= scan.nextInt();
        System.out.println("What is your instalment quantity?");
        int months= scan.nextInt();
        double carInsurance= loan.calculateCarInsurance(carPrice,months);

        System.out.println("Your electric is + myElectric");
        System.out.println("Your internet is " + myInternet);
        System.out.println("Your mortgage is" + mortgage);
        System.out.println("Your insurance is " + carInsurance );









    }


}
