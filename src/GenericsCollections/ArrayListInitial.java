package GenericsCollections;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListInitial {
    public static void main(String[] args) {
        ArrayList<Integer>myIntArr= new ArrayList<Integer> (Arrays.asList(1,2,3,4));
        myIntArr.add(10);
        myIntArr.remove(0);
        System.out.println(myIntArr);
        System.out.println(myIntArr.get(0));
    }
}
