package CreatingClasses;

public class CalculatorAdvanced extends Calculator {
    public String screenColor;
    public CalculatorAdvanced(){
        super.displayValue=0;
        this.screenColor="blue";
    }
    public CalculatorAdvanced(String color){
        super();
        this.screenColor=color;
    }
    public void calcAverage(int a, int b){
        super.displayValue=(a+b)/2;
    }
    public int calcFactorial(int number){
        int result=1;
        for(int i=number ;i>0 ; i--){
            result = result * i;
        }
        return result;
    }
    public double squareroot(double number){
        return Math.sqrt(number);
    }
    public double power(int number,int pow){
        return Math.pow(number,pow);
    }

    public String toString() {
        return "AdvancedCalculator{" +
                "screenColor='" + screenColor + '\'' +
                ", displayValue=" + displayValue +
                '}';
    }
}