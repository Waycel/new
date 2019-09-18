package Project;

public class Memory {
    public static void gameSetup(){
        String[][] cards = { {"@", "@", "%", "%"}, { "*", "*","$","$"}, {"#","#","^", "^"}, {"@","@", "%", "%"}};
        String [][]closeCards= new String[4][4];
        for( int i= 0; i<4; i++){
            for( int j= 0; j<4; j++){
                closeCards[i][j]= "[]";
            }

        }
        String [][] status= new String[4][4];

    }
    public static boolean statusCheck(){
        //Checm entire status and return true if all values are 1 otherwise return false.
        return true;

    }
    public static void askUser(){

    }
    public static void displayCards(){

    }
}
