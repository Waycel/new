package GenericsCollections;

import java.util.ArrayList;
import java.util.Arrays;

public class RemovingDuplicateStrings {
    public static void removeDuplicateStrings(ArrayList<String> arr){
        ArrayList<String> emptyArray= new ArrayList<>();
        for(String element:arr){
            if(!emptyArray.contains(element)){
                emptyArray.add(element);

            }
        }
        System.out.println(emptyArray);

    }

    public static void main(String[] args) {
        ArrayList<String > test= new ArrayList<>((Arrays.asList("Chicago", "New Orleans", "Atlanta", "Chicago")));
        removeDuplicateStrings(test);

    }

}
