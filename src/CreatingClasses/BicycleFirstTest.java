package CreatingClasses;

public class BicycleFirstTest {
    public static void main(String[] args) {
        BicycleFirst myBike= new BicycleFirst(16, "lime");

        System.out.println("Custom Bike");
        System.out.println(myBike.color);
        System.out.println(myBike.size);

        System.out.println("Standart Bike");
        BicycleFirst myStd= new BicycleFirst();
        System.out.println(myStd.color);
        System.out.println(myStd.size);

        System.out.println("Standart 2");
        BicycleFirst myStd2= new BicycleFirst();
        System.out.println(myStd2.color);
        System.out.println(myStd2.size);

        if(myStd==myStd2){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }

        System.out.println(myStd);
        System.out.println(myStd2);
        System.out.println(myBike);
        System.out.println("------------------");

        myBike.goFast();
        myBike.goSlow();
        myBike.goFaster();

    }
}
