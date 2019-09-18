package GenericsCollections;

import java.util.ArrayList;
import java.util.Arrays;

public class ShiftingElements {
    public static void shiftElements(ArrayList<Integer>arr, int left){
        for( int i= 0; i<left; i++){
            arr.remove(0);

        }
        System.out.println(arr);
    }

    public static void main(String[] args) {
        ArrayList<Integer> myArr= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        shiftElements(myArr,5);
    }
}
