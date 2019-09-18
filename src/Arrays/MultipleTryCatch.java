package Arrays;

public class MultipleTryCatch {
    public static void main(String[] args) {
        int[] arr= new int [4];
        try{
            System.out.println(arr[20]);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Issue");
        }
        catch (Exception e){
            System.out.println("Parent Exception");
        }
        System.out.println("Show Must Go On");
    }
}
