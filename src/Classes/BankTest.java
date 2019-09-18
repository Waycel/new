package Classes;

public class BankTest {
    public static void main(String[] args) {

        Bank myAcc= new Bank(123, "Vacation", 980);
        System.out.println(myAcc.toString());
        myAcc.addMoney(125.500);
        System.out.println(myAcc.showCurrentBalance());


        CarLoan myCar= new CarLoan(2.4,36,24999.00,1.5, 820);
        System.out.println(myCar.calculateMonthlyPayment());
        System.out.println(myCar.calculateTotalPayment());

        HomeLoan myHome= new HomeLoan(1.4,400,450000,130);
        System.out.println(myHome.calculateMonthlyPayment());

    }
}
