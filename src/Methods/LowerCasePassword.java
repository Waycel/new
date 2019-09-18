package Methods;

public class LowerCasePassword {
    public static String createPasswordWLowerCase() {
        String result= "";
        for (int i=0; i<6; i++) {

            double random= (Math.random()* (122-97))+97;
            result=result+(char)random;
        }
return result;
    }
public static void main(String[] args) {
    System.out.print(createPasswordWLowerCase());
}
}
