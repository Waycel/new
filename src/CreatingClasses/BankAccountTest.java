package CreatingClasses;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount myAccount= new BankAccount("Saving",909000.00, 123456);
        myAccount.displayBalance();
        myAccount.drawmoney(45500.00);
        myAccount.displayBalance();
    }
}
