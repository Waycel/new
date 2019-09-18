package Arrays;

public class SplitArray {
    public static void main(String[] args) {
        int[] myArr= {1,2,3,4,5,6,7,8,9,10};
        int lenghtArray= myArr.length; //to calculate lenght of input array
        int halfLenght= lenghtArray/2; //to use sub array initizilation.
        int index=0;
        int [] array1= new int [halfLenght];//output array1 initilizitaion
        int [] array2= new int [halfLenght];//output array2 initilizitaion
        for(int i=0; i<lenghtArray;i++){
            if(i<halfLenght){ //to put values arr1
                array1[index]=myArr[i];
            }
            else { // to put values arr2
                array2[index]=myArr[i];
            }
            index++;
            //if yo reached half lenght reset the counter
            if (index>=halfLenght){
                index=0;
            }
        }//print arr1
        for(int i=0;i<halfLenght; i++){
            System.out.print(array1[i]);
        }
        System.out.println();
        //print arr2
        for(int j=0; j<halfLenght; j++){
            System.out.print(array2[j]);
        }
    }
}
