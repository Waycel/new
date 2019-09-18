/*
- Create HashMap with elements given below
- Los Angeles- 85
- Chicago - 30
- Denver - 55
- Orlando - 90
 */

package GenericsCollections;

import java.util.HashMap;

public class HashMap2 {
    public static void main(String[] args) {
        HashMap < String, Integer> myCity= new HashMap<String ,Integer>();
        myCity.put("Los Angeles", 85);
        myCity.put("Chicago", 30);
        myCity.put("Denver", 55);
        myCity.put("Orlando", 90);
        System.out.println(myCity);

        int average= 0;
        for( String key : myCity.keySet()){
            System.out.println("City : "+ key + " Temperature : "+ myCity.get(key));
            average= average + myCity.get(key);

        }
        System.out.println("Average Temp : " + average/ myCity.size());
    }
}
