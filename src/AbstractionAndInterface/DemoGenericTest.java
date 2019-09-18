package AbstractionAndInterface;

public class DemoGenericTest {
    public static void main(String[] args) {
        DemoGeneric<Integer> myGen= new DemoGeneric<Integer>(4,8);
        System.out.println(myGen.getFirst());
        myGen.setFirst(10);
        System.out.println(myGen.getFirst());
    }
}
