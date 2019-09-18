package Arrays;

import java.util.Scanner;

public class ArrayNumsOdds {
    public static void main(String[] args) {
        int[] myArray= {1,123,14214,34235,525,34,5464,21,11,435,235235,5235235,52,235};
        int counter=0; //to count number of odd numbers
        for(int i=0;i<myArray.length;i++){
            if(myArray[i]%2!=0){ //check is it odd
                counter=counter+1;
            }
        }
        System.out.println(counter);

        //Asking user
        Scanner scanner= new Scanner(System.in);
        int[] myArr= new int[5];

        for(int i=0;i<myArr.length;i++) {
            System.out.println("Enter Number: ");
            myArr[i]= scanner.nextInt();
        }
        int numberofOdds=0;
        for(int i=0; i<myArr.length; i++){
            if(myArr[i] %2==1){
                numberofOdds++;
            }
        }
        System.out.println("There are " + numberofOdds+"odd numbers in your numbers");



    }
}
