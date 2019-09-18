package Classes;

public class Recursion {
    static int counter=0;
    static void method(){


        if(counter<5){
            System.out.println("Hello World");
            counter++;
            method();
        }

    }

    public static void main(String[] args) {
        method();
    }
}
