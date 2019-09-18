package AbstractionAndInterface;

public class ClassChild implements InterfaceA, InterfaceB {
    public void methodA(){
        System.out.println("This is from Interface A");
    }
    public void methodB(){
        System.out.println("This is from Interface B");
    }
}
