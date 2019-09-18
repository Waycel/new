package Classes;

public class B extends A {
    int b;
    void methodB(){
        System.out.println("This is B");
    }
    void methodB(String str){
        System.out.println(str); // Overloading
    }
}
