package CreatingClasses;

public class Modifiers {
    private double balance;
    Modifiers(){
        this.balance=10.0;
    }

    public void setBalance (double myBalance) {
        this.balance= myBalance;
    }
    public double getBalance(){
        return this.balance;
    }
}
