package GenericsCollections;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstDerivation {
    public static void printFirstDerivation(ArrayList<Integer> arr){
        ArrayList<Integer>firstderiv= new ArrayList<>();
        for( int i=1; i<arr.size(); i++){
            firstderiv.add(Math.abs(arr.get(i-1)- arr.get(i)));

        }
        System.out.println(firstderiv);
    }

    public static void main(String[] args) {
        ArrayList<Integer> myArr = new ArrayList<Integer>(Arrays.asList(10,50,40,53,34546,4645,654,7665));
        printFirstDerivation(myArr);
    }
}
