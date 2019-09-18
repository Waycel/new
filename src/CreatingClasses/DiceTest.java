package CreatingClasses;

public class DiceTest {
    public static void main(String[] args) {
        Dice myDice= new Dice ();
        //System.out.println(myDice.getFaces());
        System.out.println(myDice.rollTheDice());
        Dice myDice2= new Dice();
        System.out.println(myDice2.rollTheDice());
        Dice myCustomDice= new Dice (20);
        System.out.println(myCustomDice.rollTheDice());
        int myFace= myDice.getFaces();


    }
}
