package Classes;

public class PowerRecursion {
    static int powNum( int base, int pow){
        if(pow==0){
            return 1;
        }
        else {
            return powNum(base, pow-1) * base;
        }

    }

    public static void main(String[] args) {
        System.out.println(powNum(3,6));
    }

}
