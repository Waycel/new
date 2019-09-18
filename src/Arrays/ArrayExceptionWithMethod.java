package Arrays;
import java.util.Scanner;
public class ArrayExceptionWithMethod {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Row index : ");
        int row = scan.nextInt();
        System.out.println("Column index : ");
        int column= scan.nextInt();

        System.out.println(giveMeValue(row,column));

        System.out.println("Next line in my codes");
    }
    public static String giveMeValue( int rowIndex, int columnIndex){
        String result="";
        int [][] myArray= {
                {1,2,3,4,5,6},
                {123,45435,47,768678,789879,3432,656,7678,435},
                {4,345,56546,234,12312,4565,7878,789789,89,456},
                {4,4523454,45,345}
        };
        try{
            result = result+ myArray[rowIndex][columnIndex];
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("index bound(s) exceeded");
        }


        return result;
    }
}
