package Arrays;

public class ArrayRandom {
    public static void main(String[] args) {
        int[] arr= new int[20];
        double randomNumber;
        for (int i=0; i<arr.length;i++){
            randomNumber=Math.random()*(5000-1000)+1000;
            arr[i]=(int)randomNumber;
        }
        MyArrayMethods.listAllElement(arr);
        int[] returnedArray= ArrayRandomMethod.createArrayRandomIntegers(100);
        MyArrayMethods.listAllElement(returnedArray);
    }
}
