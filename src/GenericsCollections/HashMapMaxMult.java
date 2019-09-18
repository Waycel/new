package GenericsCollections;

import java.util.HashMap;

public class HashMapMaxMult {
    public static void findAdjMaxMult(int[] arr){
        HashMap<Integer,String> results = new HashMap<>();
        int multResult;
        int tempindex;
        for(int i=0 ; i<arr.length-1 ; i++ ){
            multResult = arr[i]*arr[i+1];
            tempindex = i+1;
            results.put(multResult,"i:"+ i + " value:" + arr[i] +" | "+ "i:"+tempindex+" value:" + arr[i+1]);
        }
        int max = 0;
        for(int key:results.keySet()){
            //System.out.println("key:"+key+"  " + results.get(key));
            if(key>max){
                max=key;
            }
        }
        System.out.println(results.get(max) + " \n Max Multiplication : " + max);

    }

    public static void main(String[] args) {
        int[] myArr = {1,2,3,5,2,4};
        findAdjMaxMult(myArr);
    }
}