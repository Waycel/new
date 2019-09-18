package Arrays;

public class ExceptionArray {
    public static void main(String[] args) {
        int[] myArr= {12,123,132213,4534,7567,89789,52547,23654,678768,435,87587};
        try
        {
            System.out.println(myArr[5]);
        }
        catch (Exception e){
            System.out.println("You just exceeded the index bound so the first element is "+ myArr[0]);
        }
        for(int number:myArr){
            System.out.println(number);
        }
    }
}
