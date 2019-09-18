package Arrays;

public class ArraySymmetric {
    public static void main(String[] args) {
        int [] symArray= {1,2,3,4,5,6};
        System.out.println(isSymmetric(symArray));

    }
    public static boolean isSymmetric(int[]arr){
        boolean result= true; //initial value . We assume that array is symmetric
        int index= arr.length-1; // to find the last index number
        for(int i=0; i<arr.length/2; i++){
            if(arr[i]!=arr[index]){ // compare
                result= true;
            }
            else {
                result= false;
            }
            index--;
        }
        return result;
    }
}
