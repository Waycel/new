package Classes;

public class HomeLoan extends Loan {
    private int PMI;

    public HomeLoan(double interestRate, int numberOfPayment, double amount, int PMI) {
        super(interestRate, numberOfPayment, amount);
        this.PMI = PMI;
    }
    public HomeLoan(double interestRate, int numberOfPayment, double amount){
        super(interestRate, numberOfPayment,amount);
        this.PMI= 120;

    }
    @Override
    double calculateMonthlyPayment(){
        return super.amount*super.interestRate/super.numberOfPayment+this.PMI;
    }
    @Override
    double calculateTotalPayment() {
        return this.amount * this.interestRate+ this.PMI*super.numberOfPayment;
    }
}
