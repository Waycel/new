package GenericsCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class FirstArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> myFirstList= new ArrayList<Integer>();
        System.out.println(myFirstList);
        myFirstList.add(1);
        System.out.println(myFirstList);
        myFirstList.add(2);
        System.out.println(myFirstList);
        for(int i=3; i<=1000; i++){
            myFirstList.add(i);

        }
        System.out.println(myFirstList);
        System.out.println(myFirstList.get(0));

        printElementofArrayList(myFirstList);


    }
    public static void printElementofArrayList(ArrayList<Integer> arr){
        Iterator myIter= arr.iterator();


        while(myIter.hasNext()){
            System.out.println(myIter.next());
        }

    }


}
