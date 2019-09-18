package GenericsCollections;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateRemoving {
    public static void removeDuplicates(ArrayList<Integer> arr){
        ArrayList<Integer> newArr= new ArrayList<>();
        for (int element: arr){
            if(arr.contains(element)){
                newArr.add(element);

            }
        }
        System.out.println(newArr);
    }

    public static void main(String[] args) {
        ArrayList<Integer> myList= new ArrayList<>(Arrays.asList(1,2,3,3,4,2,5,1,3,6));
        removeDuplicates(myList);
    }
}
