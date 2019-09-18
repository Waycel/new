package Arrays;

public class Foreach {
    public static void main(String[] args) {
        int [] forforeach= {1,2,3,4,5,345435,45345,35345,345345435,345345435,7};
        for(int number: forforeach){
            System.out.println(number);
        }
        String[] cities= {"Sacramento", "Salt Lake City", "Houston", "San Diego"};
        for (String city:cities){

            System.out.println(city);
        }
    }
}
