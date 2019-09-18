/*
Design Paint class according to requirements given below

Attributes

String colorName

Double sqrfeet

Double totalPrice

Constructors

With all attributes

Methods

Calculate price

Per 100 sqrfeet 1 gallon and each gallon is $32.99

toString
 */

package CreatingClasses;

public class Paint {
    protected String colorName;
    protected double totalPrice;
    protected double sqrFeet;


    public Paint( String colorName, double price, double sqrFeet){
        this.colorName= colorName;
        this.totalPrice= price;
        this.sqrFeet= sqrFeet;

    }
    protected void calculatePrice(){
        this.totalPrice= this.sqrFeet/100 * 32.99;
    }
    protected void calculatePrice(double sqrFeet){
        this.totalPrice= sqrFeet;
    }

    public String toString() {
        return "Paint{" +
                "colorName='" + colorName + '\'' +
                ", price= $" + totalPrice +
                ", sqrFeet=" + sqrFeet +
                '}';
    }
}
