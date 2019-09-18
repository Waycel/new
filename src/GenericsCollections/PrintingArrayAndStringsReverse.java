package GenericsCollections;

import javax.xml.parsers.SAXParser;
import java.util.ArrayList;
import java.util.Arrays;

public class PrintingArrayAndStringsReverse {
    public static String reverseString(String str){
        String newStr="";
        for(int i=str.length(); i>=0; i--){
            newStr= newStr+str.charAt(i);

        }
        return newStr;
    }
    public static void reverseArrayList(ArrayList<String > arr){
        ArrayList<String > reversed= new ArrayList<String>();
        for(int i= arr.size()-1; i>=0; i--){
            reversed.add(reverseString(arr.get(i)));
        }
        System.out.println(reversed);
    }

    public static void main(String[] args) {
        ArrayList<String > myArray= new ArrayList<String >(Arrays.asList("abc", "def", "ghi"));
        System.out.println(myArray);
        String abc= "abc";
        System.out.println(reverseString(abc));
    }

}
