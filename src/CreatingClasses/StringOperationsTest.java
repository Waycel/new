package CreatingClasses;

public class StringOperationsTest {
    public static void main(String[] args) {
        StringOperations myStrNoParam = new StringOperations();
        System.out.println(myStrNoParam.reversed());
        StringOperations  myStrParam= new StringOperations("JAVA");
        System.out.println(myStrParam.reversed());
        System.out.println(myStrNoParam.reversed("This is a Test"));
        System.out.println(myStrParam.reversed("1*2*3"));
        //System.out.println("ABC".toLowerCase());
        System.out.println(myStrParam.makeOnlyFirstLetterUpper());
        System.out.println(myStrParam.returnAsArray());
        char [] output= myStrNoParam.returnAsArray();
        for(char letter: output){
            System.out.println(letter);
        }
    }
}
