/*
Write a method to display max value of each row in a 2-dimensional array
Write a method to display min value of each row in a 2-dimensional array
Write a method to diplay  max difference of each row in a 2-dimensional array
 */
package Arrays;

public class MinMaxDiffMax {
    public static void main(String[] args) {
        int [][] myArray={{12,343,45343,46456,45645656,645546,6456456,},
                {2,3,5,6,76,7,8,8,7,9,4,3,5,5,67,7,},
                {324324,645,342,5758,9,465,234,45,6,435},
                {35,56456,6456,3432,77,343,123,354,67657,8,646,56456456,47} };

        int[][] result= findMinMaxDiffMax(myArray);
        for(int i=0; i<result.length; i++){
                System.out.println("Max:"+ result[i][0]+"Min : + result[i][1]"+ "MaxDiff :" + result [i][2]);
            System.out.println();
        }
    }
    public static int[][] findMinMaxDiffMax(int[][]arr){
        int[][] resultTable= new int[arr.length][3];
        int maxValue;
        int minValue;
        int maxDiff;
        for(int i=0; i<arr.length; i++){
            maxValue= arr[i][0];
            minValue= arr[i][0];
            for(int j=0; j<arr[i].length;j++){
                if(arr[i][j]>maxValue){
                    maxValue= arr[i][j];

                }
                if(arr[i][j]<minValue){
                    minValue= arr[i][j];
                }

            }
            maxDiff= maxValue-minValue;
            resultTable[i][0]= maxValue;
            resultTable[i][1]= minValue;
            resultTable[i][2]= maxDiff;
        }
        return resultTable;
    }
}
