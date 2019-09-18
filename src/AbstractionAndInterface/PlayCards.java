package AbstractionAndInterface;

import java.util.Stack;

public class PlayCards {
    public static void main(String[] args) {
        String[] cards= {"1","2","3","4","5","6","7","8","9","10","Jack","Queen","king","Ace"};
        double rand;
        Stack<String > myCards= new Stack<>();
        for(int i=0; i<6; i++){
            rand = Math.random()* 14;
            myCards.push(cards[(int) rand]);
        }
        System.out.println(myCards);
        myCards.pop();
        System.out.println(myCards);
        myCards.pop();
        System.out.println(myCards);
        myCards.pop();
        System.out.println(myCards);
        myCards.pop();
        System.out.println(myCards);
    }
}
