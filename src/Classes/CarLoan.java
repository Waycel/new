package Classes;

public class CarLoan extends Loan {
    double APR;
    int creditScore;

    CarLoan(double interestRate, int numberOfPayment, double amount, double APR, int creditScore) {
        super(interestRate, numberOfPayment, amount);
        super.amount = amount;
        this.APR= APR;
        this.creditScore= creditScore;

    }
    @Override
    double calculateMonthlyPayment(){
        return super.amount*this.APR/super.numberOfPayment-(this.creditScore/10);
    }
}