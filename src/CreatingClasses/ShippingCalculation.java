package CreatingClasses;

public class ShippingCalculation {
    public static void main(String[] args) {
        ShippingCalculation myShipping = new ShippingCalculation();
        System.out.printf("$ %.2f", myShipping.calculateCost(12.5,1.8));
        System.out.printf("$ %.2f ",myShipping.calculateCost(12.5,1.8,2.4));

    }
    public double calculateCost(double price, double tax){
        double cost;
        cost= (price+tax)*1.1;
        return cost;
    }
    public double calculateCost(double price, double tax, double shipping){
        double cost;
        cost= (price+ tax)*1.1+shipping;
        return cost;
    }
}
