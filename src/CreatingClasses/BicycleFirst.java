/*
Write a Bicycle Class with properties and methods listed and create at least 1 Bicycle object than list all properties and methods in the main
Properties
Color
Size
Methods
Go fast . (print )
Go faster (print)
Go slowly (print)
Slow down (print)
 */
package CreatingClasses;

import java.sql.SQLOutput;

public class BicycleFirst {
    int size=10;
    String color="Red";
    public BicycleFirst(int sizeBike, String colorBike){
        this.size= sizeBike;
        this.color= colorBike;
    }
    public BicycleFirst(){
        this.size=18;
        this.color="Blue";

    }
    public void goFast(){
        System.out.println("Go Fast");
    }
    public void goFaster(){
        System.out.println("Go Faster");
    }
    public void goSlow(){
        System.out.println("Go Slow");

    }
    public void slowDown(){
        System.out.println("Slow Down");

    }
}
