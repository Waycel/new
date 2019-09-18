package Arrays;

public class CommonElements {
    public static void main(String[] args) {
        int[] array1= {1, 345,2332, 33423,4,5,6,6}; //Array1 to test our Methads (parameter)
        int[] array2= {4,5,6,67585,424,345345,674564,2342,2332}; //Array to test our Methods (Parameter)
        findCommon(array1,array2); // void method is called
        int[] resultArray= finCommonInts(array1, array2); // int method is called
        MyArrayMethods.listAllElement(resultArray); // We called Method we wrote yesterday. Method for listing all elements of


    }
    //void method to find common elements in 2 arrays
    public static void findCommon(int[] arr1, int arr2[]){
        for(int i =0; i<arr1.length; i++){

            for (int j=0; j<arr2.length; j++) {
                if(arr1[i]==arr2[j]) {
                    System.out.println(arr1[i]);
                }

            }
        }

    }
    public static int[] finCommonInts(int[] arr1, int[] arr2) {
        int size= 0;
        if(arr1.length>arr2.length){
            size= arr1.length;

        }
        else {
            size= arr2.length;
        }
        int[] returnArray= new int[size];
        for(int i=0; i<arr1.length; i++) {
            for (int j=0; j<arr2.length; j++) {
                if(arr1[i]==arr2[j]){
                    returnArray[i]=arr1[i];
                }
            }
        }
        return returnArray;

    }
}
