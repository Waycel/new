package ClassandmethodsExample;

public class Invoices {
    //Method to evaluate Electric Consumption
    public String evaluateelectric(int consumption) {
        String result ="";
        if(consumption>500 && consumption<1000) {
            result="Good Job";
        }
        else if(consumption>=1000 && consumption<1500) {
            result="Not Bad";

        }
        else if(consumption>=1500) {
            result="Start to Save Energy";
        }
       else {
            System.out.println("Consumption is out of scope");
        }
        return result;
    }
    //method for Internet Bill
    public String evaluateInternet(int speed) {
        String result= "";
        if(speed>300) {
            result= "Good Speed";

        }
        else if (speed>100){
            result= "Sper Speed";

        }
        else {
            result= "Speed out of Scope";
        }
        return result;
    }

}
