package CreatingClasses;

public class Execution {
    public static void main(String[] args) {
        System.out.println(add(3,4));
        System.out.println(calculate(3,4));
    }
    public static double add(int a, int b){
        return a+b;

    }
    public static double calculate(int num1, int num2){
        return add(num1,num2)/5;
    }

}
