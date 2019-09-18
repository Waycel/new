package Methods;

public class StringChar {
    public static void printrewerse (String word){
        for (int i =word.length()-1; i>=0;i--)
            System.out.print(word.charAt(i));
    }


    public static void main(String[] args) {
        printrewerse("1-2-3-4-5");
        System.out.println();
    }
}
