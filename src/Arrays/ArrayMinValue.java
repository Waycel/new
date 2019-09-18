package Arrays;

public class ArrayMinValue {
    public static void main(String[] args) {
        int[]array= {-6,465,675676,878,45345,65476,67};
        printMinValue(array);

    }
    public static void printMinValue(int[] array) {
        int container= array[0];
        for (int i=1; i<array.length; i++){
            if (array[i]< container){
                container= array[i];


            }
        }
        System.out.println(container);
    }
}
