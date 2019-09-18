package Classes;

public class FactorialRecursion {
    static int result=1;
    static int f( int a){
        if(a>0){
            result= result* a;
            f(a-1);
        }
        return result;

    }
    public static int factorial (int number){
        if(number==1){
            return 1;
        }

        else {
            return factorial(number -1)* number;

        }
    }

    public static void main(String[] args) {
        System.out.println (f(6));
        System.out.println(factorial(0));
    }
}
