package CreatingClasses;

public class ArrayClassConstTest {
    public static void main(String[] args) {
        ArrayClassConst myInstance= new ArrayClassConst();
        System.out.println(myInstance.size);
        ArrayClassConst myInstance2 = new ArrayClassConst(20);
        int [] newArray = myInstance.initialArray();
        myInstance.printEvenIndexes(newArray);
        myInstance.printOddIndexes(myInstance.initialArray());
    }
}
