package Methods;

public class RandomPassword {
    //Sloution with
public static int createRandomPassword(){
    double randomNumber= Math.random()*(1000000-100000)+100000;
    int result= (int) randomNumber;
    return result;
}
//Solution with String and concat
public static String createRandomPassString(){
    String password="";
    double rand; //variable for random number
    for(int i= 1; i<7;i++){ //to create 6 iterations
        rand=Math.random()*10; //produce random number 0-9
        int randInt=(int) rand; //type casting double to int
        password= password+randInt; //concatenation

    }
    return password;

}

}