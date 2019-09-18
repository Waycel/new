package GenericsCollections;

import java.util.HashMap;

public class HashMapOccurs {
    public static void findOccurs(int[] arr) {
        HashMap<Integer, Integer> occurs= new HashMap<>();
        int counter= 0;
        for( int i=0; i<arr.length; i++){
            for(int j= 0; j<arr.length; j++){
                if(arr[i]==arr[j]){
                counter++;
                }
            }
            occurs.put(arr[i], counter);
            counter=0;
        }
        System.out.println(occurs);
    }

    public static void main(String[] args) {
        int[] myArr= {1,2,2,2,2,2,2,2,2,2,3};
        findOccurs(myArr);
    }
}
