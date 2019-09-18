package CreatingClasses;

public class Calculator {
    int displayValue;
    public Calculator(){
        this.displayValue=0;


    }
    public int add(int number1, int number2){
        return number1+ number2;

    }
    public int add( double num1, double num2){
        return (int) (num1+num2);

    }
    public double divide( int num1, int num2){
        double result=0;
        try{
            result = num1/ num2;
        }
        catch (ArithmeticException e){

        }
        return result;

    }
    public int subtract(int num1, int num2){
        return num1- num2;

    }

    public int multiply(int num1, int num2){
        return num1*num2;
    }

}
