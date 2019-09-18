package GenericsCollections;

import java.util.ArrayList;

public class GenericMethods {
    public static <T> void displayOdNumbers(ArrayList<Integer> arr){
        for(int element: arr){
            if(element%2==1){
                System.out.println(element);
            }
        }
    }
    public static <T> int countNumberOfElements(T[] arr){
        int count=0;
        for(T element: arr){
            count++;
        }
        return count;
    }

}
