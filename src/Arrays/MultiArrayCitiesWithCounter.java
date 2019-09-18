/*
1) Create random 2-dimensional String array with city names
2) print cities with first letter is "A"
3) print all city names reversed
4) print city names starts with between a-h
5) print city names has letter a in it
 */
package Arrays;

public class MultiArrayCitiesWithCounter {
    public static void main(String[] args) {
        String[][] cities={
                {"Aydin","Houston","Dallas", "Austin","San Antonio"},
                {"San Diego","Charlotte","Baton Rouge","Oklahoma City","Boulder"},
                {"Atlanta","Miami","Austin","Mineapolis","San Francisco"},
                {"Kansas City","Pittsburg","Los Angeles","Seattle"}
        };
        printCitiesWithFirstLetterA(cities);
        printCitiesReversed(cities);
        printCitiesBetweenAH(cities);
        System.out.println("------------");
        printCitiesHasA(cities);
    }
    public static void printCitiesHasA (String[][] cities){
        System.out.println("PRINT CITIES HAS A");
        int counter=0;
        for( int i=0; i<cities.length; i++){
            for (int j=0; j<cities.length; j++){
                for(int k=0; k<cities[i][j].length();k++){
                    if(cities [i][j].charAt(k)=='a'){
                        counter++;
                    }
                }
                if(counter>0){
                    System.out.println(cities[i][j]);
                }
                counter=0;
            }
        }
    }
    public static void printCitiesReversed(String[][] cityArray){
        System.out.println("PRINT CITIES REVERSED");
        String city= null;
        int thelastIndex=0;
        for(int i =0; i<cityArray.length;i++){
            for(int j=0; j<cityArray[i].length; j++){
                city=cityArray[i][j];
                thelastIndex=city.length()-1;
                for(int k=thelastIndex;k>=0;k--){
                    System.out.print(city.charAt(k));
                }
                System.out.println();
            }
        }
    }
    public static void printCitiesWithFirstLetterA(String [][] cityNames){
        System.out.println("PRINT CITIES WITH FIRST LETTER A");
        for(int i=0; i<cityNames.length; i++){
            for(int j=0; j<cityNames[i].length; j++){
                String city=cityNames[i][j];
                if(city.charAt(0)=='A'){
                    System.out.println(cityNames[i][j]);
                }
            }
        }
    }
    public static void printCitiesBetweenAH(String[][] myCities){
        System.out.println("PRINT CITIES BETWEEN A H");
        for(int i=0; i<myCities.length; i++){
            for( int j=0; j<myCities[i].length;j++){
                if(myCities[i][j].charAt(0)>=65 && myCities[i][j].charAt(0)<=72){
                    System.out.println(myCities[i][j]);
                }
            }
        }
    }
}
