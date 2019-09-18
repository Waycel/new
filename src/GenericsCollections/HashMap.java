/*
QUESTION
- Create String key, String value hashmap using data below
- Java- medium
- Sql - entry
- Selenium - master
- Cucumber- expert
 */

package GenericsCollections;

public class HashMap {
    public static void main(String[] args) {
        java.util.HashMap<String, String> myFirstHashMap = new java.util.HashMap<>();
        myFirstHashMap.put("Java", "medium");
        myFirstHashMap.put("SQL", "Entry");
        myFirstHashMap.put("Selenium", "Master");
        myFirstHashMap.put("Cucumber", "Expert");
        System.out.println(myFirstHashMap);

        for( String key : myFirstHashMap.keySet()){
            System.out.println("Key : " + key + " Value: " + myFirstHashMap.get(key));
        }
    }
}
