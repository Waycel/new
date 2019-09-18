package Classes;

public class ABCTest {
    public static void main(String[] args) {
        C myC= new C();
        myC.methodA();
        myC.methodB();
        A myA= new A();
        myA.methodA();
        myC.methodB("Hello World");

        B myB= new B();
        myB.methodB("Heeey");
    }
}
