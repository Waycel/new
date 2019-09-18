package ClassandmethodsExample;

public class Suggestions {
    public void suggestFood(){
        double rand= Math.random()*3+1;
        if((int) rand==1){
            System.out.println("Drink Soup");
        }
        else if((int) rand==2){
            System.out.println("Eat hamburger");
        }
        else {
            System.out.println("Enjoy Salad");
        }

    }
    public void suggestCloth() {
        double random= Math.random()*3+1;
        if ((int) random==1){
            System.out.println("Red shirt");
        }
        else if((int) random==2){
            System.out.println("Blue Jean");

        }
        else {
            System.out.println("White Hat");
        }

    }
}
