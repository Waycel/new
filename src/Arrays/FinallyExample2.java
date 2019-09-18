package Arrays;

public class FinallyExample2 {
    public static void main(String[] args) {
        try{
            int a= 2/0;

        }
        catch (ArithmeticException e){
            System.out.println("Zeroo");

        }
        finally {
            System.out.println("Connection Closed");
        }
    }
}
