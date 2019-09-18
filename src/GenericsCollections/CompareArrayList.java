package GenericsCollections;

import java.util.ArrayList;
import java.util.Arrays;

public class CompareArrayList {
    public static boolean compareArrayList(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
        boolean equal= true;
        if(arr1.size()!= arr2.size()){
            equal= false;
        }
        else{
            for (int i= 0; i<arr1.size(); i++){
                if(!arr2.contains(arr1.get(i))){
                    equal= false;
                }

            }
        }
        return equal;


    }

    public static void main(String[] args) {
        ArrayList<Integer>arr1= new ArrayList<Integer>(Arrays.asList(1,2,3,5));
        ArrayList<Integer>arr2= new ArrayList<Integer>(Arrays.asList(1,7,3));
        System.out.println(compareArrayList (arr1,arr2));
    }
}
