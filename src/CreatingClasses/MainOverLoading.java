package CreatingClasses;

public class MainOverLoading {
    public static void main(String[] args) {
        System.out.println("Here Original Main");
        main("Hello");
        main("1","2");
    }

    public static void main(String parameter1) {
        System.out.println("Main with 1 String Parameter");
        main("param 1", " param 2");

    }

    public static void main(String parameter1, String parameter2) {
        System.out.println("Main with 2 string parameters" + parameter1 + parameter2);
    }
}
