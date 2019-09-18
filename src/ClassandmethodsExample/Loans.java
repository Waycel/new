package ClassandmethodsExample;

public class Loans {
    public int calculateMortgage(int month, int monthlyPayment) {
        int result= monthlyPayment*(360-month);
        return result;

    }
    public double calculateCarInsurance(int carPrice, int months) {
        double insurance= (carPrice/months)*0.9-months;
        return insurance;
    }
}
