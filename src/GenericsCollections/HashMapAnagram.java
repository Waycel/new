package GenericsCollections;

import java.util.Arrays;

public class HashMapAnagram {
    public static boolean isAnagram (String str1,String str2){
        boolean anagram=true;
        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();
        Arrays.sort(str1Array);
        Arrays.sort(str2Array);
        if(str1Array.length!=str2Array.length){
            anagram=false;
        }
        else{
            for(int i=0 ; i<str1Array.length ; i++){
                if(str1Array[i]!=str2Array[i]){
                    anagram=false;
                }
            }
        }
        return anagram;
    }
    public static void showAnagrams(String[] arr){
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr.length ; j++){
                if(i!=j && isAnagram(arr[i],arr[j])){
                    System.out.println(arr[i] + " and " + arr[j] + " is anagrams");
                }
            }
        }
    }

    public static void main(String[] args) {
        //System.out.println(isAnagram("color","cloro"));
        String[] myArr = {"race","care","color","loroc","fsf","fds"};
        showAnagrams(myArr);
    }
}