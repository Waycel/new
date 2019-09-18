package Arrays;

public class ArrayAndMathException {
    public static void main(String[] args) {
        int[]myArr={1,2,3,4,5,6};
        try{
            myArr[9]=5/0;
        }
        catch (Exception e){
            System.out.println("Exception occured");
        }
        /*
        catch (ArithmeticException e){
            System.out.println("Division by zero");


        }

         */
        System.out.println("SHOW MUST GO ON");


    }
}
