package Methods;

public class RandomPassString {
    public static String createrandomStringPass () {
        String password= "";
        double rand; //to store random double value
        int randInt; //to store double to int value
        char randChar; //to store int to char conversationvalue
        for(int i= 6; i >=1; i--){
            rand= Math.random()*(122-97)+97; //producing random number in range 97-122
            randInt=(int) rand; //double to integer type casting
            randChar=(char) randInt; //integer to char type castign (conversation)
            password=password+randChar;
        }
        return password;
    }

    public static void main(String[] args) {
        System.out.println(createrandomStringPass());
    }



    }
