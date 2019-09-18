package Arrays;

public class ArrayMaxValue {
    public static void main(String[] args) {
        int [] myArr= {1,2,3,4,5,6,7,8,9,10};
        int max= findMaxValue(myArr);
        System.out.println(max);
    }
    public static int findMaxValue(int[] arr){
        int container= arr[0]; // putting first element inside container
        for(int i=1;i<arr.length;i++) {
            if(arr[i]>container){
                container = arr[i];
            }
        }
        return container;
    }
}