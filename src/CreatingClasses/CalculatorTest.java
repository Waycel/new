package CreatingClasses;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorAdvanced myCalcAdv = new CalculatorAdvanced();
        System.out.println(myCalcAdv.power(2,3));
        CalculatorAdvanced myRedCalc = new CalculatorAdvanced("red");
        System.out.println(myRedCalc.toString());
        myRedCalc.calcAverage(9,6);
        System.out.println(myRedCalc.toString());
        Calculator myClassicCalc = new Calculator();
        System.out.println(myClassicCalc.displayValue);
        System.out.println(myCalcAdv.calcFactorial(5));

    }


}