package CreatingClasses;

public class ConstructorTest {
    public static void main(String[] args) {
        Constructors myObj= new Constructors();
        System.out.println(myObj.year);
        System.out.println(myObj.name);
        Constructors myObj2= new Constructors();
        System.out.println(myObj2.name);
        System.out.println(myObj2.year);


        ConstructorWithParameter myObjparam= new ConstructorWithParameter(2014, "Go");
        System.out.println(myObjparam.name);
        System.out.println(myObjparam.year);
        ConstructorWithParameter myObjParam2= new ConstructorWithParameter(2010, "Slack");
        System.out.println(myObjParam2.year);
        System.out.println(myObjParam2.name);
    }
}
