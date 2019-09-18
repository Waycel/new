package GenericsCollections;


import java.util.ArrayList;
import java.util.Arrays;

public class SameDifferences {
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
        ArrayList<Integer> diffUniq= new ArrayList<>();
        for (int i=0; i<differences.size();i++){
            for(int j=1; j<differences.size(); j++){
                if(i!=j){
                    if(differences.get(i)==differences.get(j) ){
                        diffUniq.add(differences.get(i));
                    }
                }
            }
        }
        System.out.println(diffUniq);
        int temp;
        for(int i=0; i<differences.size(); i++){
          temp= diffUniq.get(i);
          diffUniq.remove(i);
          if(!diffUniq.contains(temp)){
              diffUniq.add(temp);
          }
        }
        System.out.println(diffUniq);


    }

    public static void main(String[] args) {
        ArrayList<Integer>myArr= new ArrayList<Integer> (Arrays.asList(2,3,4,6,8));
        findSameDifferences(myArr);
    }
}
