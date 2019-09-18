package Methods;

public class RandomExamples {
    public static int createRandomPassword() {
        double randomNumber= Math.random() * 1000000- 100000+100000;
        int result= (int) randomNumber;
        return result;

    }

    public static void main(String[] args) {
        for (int i =1; i<=10; i++) {
            int print = RandomExamples.createRandomPassword();
            System.out.println(print);
        }
    }
}
