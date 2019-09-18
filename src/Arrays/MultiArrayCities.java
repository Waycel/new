/*
Question
1) Create randon 2-dimensional String array with city names.
2) Print cities with first letter is "A"
3) Print all city names reversed.
4) Print city names starts with between a-h
5) Print city names has letter a in it
 */

package Arrays;

public class MultiArrayCities {
    public static void main(String[] args) {
        String[][] cities= {
                {"Arlington", "Richmond", "Albany", "Dallas"},
                {"Houston", "Charlotte", "Baton Rouge", "Oklahoma City", "Boulder"},
                {"San Diego", "Atlanta", "Miami", "Austin", "Mineapolis", "San Francisco"},
                {"Kansas City", "Pittsburg", "Los Angeles", "Seattle"}
        };
        printCitiesWithFirstLetterA(cities);
        printCitiesReversed(cities);
        printCitiesBetweenAandH(cities);
        printCitiesHasA(cities);

    }
    public static void printCitiesReversed(String[][] cityArray) {
        System.out.println("\nCITIES IN REVERSED :");
        String city=null;
        int theLastIndex=0;
        for( int i= 0; i<cityArray.length; i++){
            for (int j=0; j<cityArray.length; j++){
                city= cityArray[i][j];
                theLastIndex= cityArray[i][j].length()-1;
                for (int k= theLastIndex; k>=0; k--){
                    city.charAt(k);
                    System.out.print(city.charAt(k));
                }
                System.out.println();
            }
        }

    }

    public static void printCitiesWithFirstLetterA (String[][] cityNames){
        System.out.println("\nCITIES WITH FIRST LETTER A :");
        for(int i=0; i<cityNames.length; i++){
            for(int j=0; j<cityNames[i].length; j++){
                String city= cityNames[i][j];
                if (city.charAt(0)=='A'){
                    System.out.println(cityNames[i][j]);

                }

            }
        }

    }
    public static void printCitiesBetweenAandH(String[][] myCities){
        System.out.println("\nBETWEEN A AND H :");
        for(int i=0;i<myCities.length; i++){
            for(int j=0; j<myCities[i].length; j++){
                if(myCities [i][j].charAt(0)>=65 && myCities [i][j].charAt(0)<=72){
                    System.out.println(myCities[i][j]);
                }


            }
        }
    }
    public static void printCitiesHasA (String [][] cities){
        System.out.println("\nPRINT CITIES HAS A");
        boolean hasA= false;
        for(int i=0; i<cities.length;i++){
            for( int j=0; j<cities[i].length; j++){
                for( int k=0; k<cities[i][j].length(); k++ ){
                    if(cities[i][j].charAt(k)=='a'){
                        hasA= true;
                    }

                }
                if(hasA){
                    System.out.println(cities[i][j]);
                    hasA=false;
                }
            }
        }

    }
}
