package Arrays;

public class Exceptions {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try{
            int result= a/b;
                System.out.println(result);
        }
        catch (ArithmeticException e){
            System.out.println(a/(a/1));
        }
        System.out.println("Next Line");
    }
}
