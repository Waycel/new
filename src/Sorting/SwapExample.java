package Sorting;

public class SwapExample {
    public static void main(String[] args) {
        int a= 10;
        int b= 20;
        System.out.println("Original :" + a+ " "+ b);
        int temp= a;
        a=b;
        b= temp;

        System.out.println("Swapped :" + a +" " +b );
    }
}
