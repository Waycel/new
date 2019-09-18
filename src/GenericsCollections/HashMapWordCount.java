package GenericsCollections;

import java.util.HashMap;

public class HashMapWordCount {
    public static String removeExtraSpaces(String str){
        String filtered="";
        //str = str + " ";
        //char[] charArray = str.toCharArray();
        for(int i=0 ; i<str.length()-1 ; i++){
            if(!(str.charAt(i)==' ' && str.charAt(i+1)==' ')){
                filtered = filtered + str.charAt(i);
            }
        }
        if(str.charAt(str.length()-1)!=' '){
            filtered = filtered + str.charAt(str.length()-1);
        }

        return filtered;
    }

    public static void countWords(String sentence){
        sentence = removeExtraSpaces(sentence);
        String[] words = sentence.split(" ");
        HashMap<String,Integer> wordCount = new HashMap<>();
        int counter=0;
        for(int i=0 ; i<words.length ; i++){
            for(int j=0 ; j<words.length ; j++){
                if(words[i].equals(words[j]) && i!=j){
                    counter++;
                }
            }
            if(counter>0) {
                wordCount.put(words[i], counter);
            }
            counter=0;
        }

        System.out.println(wordCount);
    }

    public static void main(String[] args) {
        System.out.println(removeExtraSpaces("a b c"));

        countWords("java is fun if you do not know java");
    }
}