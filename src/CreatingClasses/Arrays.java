package CreatingClasses;

public class Arrays {
    public int returnIndex (int[] array, int element){
        int index= 0;
        int found= 0;
        for(int i=0; i< array.length; i++){
            if(element==array[i]){
                found= index;
            }
            index++;
        }
        return found;
    }
    public int returnIndex(String[] array, String element){
        int found=0;
        int index=0;
        for( String oneelement:array){
            if(oneelement.equals(element)){
                found= index;
            }
            index++;
        }
        return found;
    }
}
