package GenericsCollections;


import java.util.ArrayList;
import java.util.Arrays;

public class SameDifferences1 {
    public static void findSameDifferences(ArrayList<Integer> arr){
        ArrayList<Integer> differences = new ArrayList<Integer>();
        for(int i=0 ; i<arr.size() ; i++){
            for(int j=i ; j<arr.size() ; j++){
                if(i!=j) {
                    differences.add(Math.abs(arr.get(i) - arr.get(j)));
                }
            }
        }
        System.out.println(differences);
        ArrayList<Integer> difUniq = new ArrayList<>();
        for(int i=0 ; i<differences.size() ; i++){
            for(int j=i ; j<differences.size() ; j++){
                if(i!=j){
                    if(differences.get(i)==differences.get(j)){
                        difUniq.add(differences.get(i));
                    }
                }
            }
        }
        System.out.println(difUniq);
        int temp;
        for(int i=0 ; i<difUniq.size() ; i++){
            temp = difUniq.get(i);
            difUniq.remove(i);
            if(!difUniq.contains(temp)){
                difUniq.add(temp);
            }
        }

        System.out.println(difUniq);


    }

    public static void main(String[] args) {
        ArrayList<Integer> myArr = new ArrayList<Integer>(Arrays.asList(2,3,4,6,8));
        findSameDifferences(myArr);
    }
}