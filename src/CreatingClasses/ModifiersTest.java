package CreatingClasses;

public class ModifiersTest {
    public static void main(String[] args) {
        Modifiers myMod= new Modifiers();
        //System.out.println(myMod.balance);
        System.out.println(myMod.getBalance());
        double myNewBalance = 34576.78;
        myMod.setBalance(myNewBalance);
        System.out.println(myMod.getBalance());
    }
}
