package GenericsCollections;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericMethodsTest {
    public static void main(String[] args) {
        ArrayList<Integer> myList= new ArrayList<Integer>(Arrays.asList(9,9,6,23532,55,35,353,66));
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        System.out.println(myList);
        GenericMethods.displayOdNumbers(myList);
        Integer[] myList2={9,6,23532,55,35,353,66};
        System.out.println(GenericMethods.countNumberOfElements(myList2));
        String [] myList3= {"werwr","reewr","tyutt"};
        System.out.println(GenericMethods.countNumberOfElements(myList3));
    }
}
