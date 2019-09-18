package Methods;

public class PasswordNumbersLetters {
    public static String createPasswordnumsLetters(){
        String password="";
        double rand;
        char randChar;
        //for first 3 characters
        for(int i = 1; i<4; i++) {
            rand= Math.random()*(90-65)+65; //to produce random number in range 65-122
            password=password+(char) rand;


        }
        //for last 3 characters
        for(int j=1; j<4; j++) {
            rand= Math.random()*10;
            password=password+(int) rand;

        }
        return password;

    }

    public static void main(String[] args) {
        int i=1;
        while (i<=10) {
            System.out.println(createPasswordnumsLetters());
            i++;
        }
    }
}
