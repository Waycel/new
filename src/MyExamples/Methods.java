package MyExamples;

public class Methods {
    // f(x) = 5x+10
    static void write(){
        System.out.println("Hello World");
    }
    static int f(int x){
        return 5*x+10;
    }
    static int g(int x, int y){
        return f(y+2*x);
    }
    public static void main(String[] args) {
        System.out.println(g(5,3));
        write();
    }

}
