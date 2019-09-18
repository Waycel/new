/*
Write a method returns 2D array columns as rows and rows as columns
Sample
Output:
 */
package Arrays;

public class RowsAsColumns {
    public static void main(String[] args) {
        int[][] inputArray={{1,2,3},{4,5,6},{7,8,9}};
        int [][] outputArray = returnColunmsAsRows(inputArray);
        for(int i=0; i<outputArray.length; i++){
            for(int j=0; j<outputArray[0].length; j++){
                System.out.print(outputArray[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static int [][] returnColunmsAsRows(int [][] arr){
        int[][] resultArray= new int [arr[0].length][arr.length]; //to get sizes opposite
        for( int i= 0; i<arr.length; i++){
            for(int j= 0; j<arr[i].length; j++){
                resultArray[j][i]= arr[i][j]; //assign row values as column values visa versa
            }
        }
        return resultArray;

    }
}
