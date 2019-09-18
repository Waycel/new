/*
Write a method that checks if the array is square (i.e. every row has the same length as a itself).
Sample
Int[][] a = {{1,2},{3,4}}
 isSquare(int[][] a)
Result :
true
 */
package Arrays;

public class ArrayisSquare {
    public static void main(String[] args) {
        int [][] myArray = {{1,2,3},{4,5,6}, {7,8,9,}};
        System.out.println(isSquare(myArray));


    }

    public static boolean isSquare(int [][] arr){
        boolean square=true;
        int arrayLenght= arr.length;
        for(int i=0; i<arrayLenght; i++){
            if(arr.length!=arr[i].length){
                square= false;
            }
        }
        return square;


    }
}
