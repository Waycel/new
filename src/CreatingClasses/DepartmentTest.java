package CreatingClasses;

import java.sql.SQLOutput;

public class DepartmentTest {
    public static void main(String[] args) {
        DepartmentIT myIT= new DepartmentIT ("Jay", 998, "QA Engineer", 125.000, "Java, SQL, Selenium, ISQBT");
        System.out.println(myIT.toString());
        myIT.addSkill("Ruby on Rail");
        System.out.println(myIT.toString());
        myIT.riseSalary(2000);
        System.out.println(myIT.toString());

        DepartmentAccounting myAcc= new DepartmentAccounting("Alice",667, "Accounted", 75000,5);

        System.out.println(myAcc.toString());
        myAcc.addExperience(2);
        System.out.println(myAcc.experience);
        DepartmentAccounting myAcc2= new DepartmentAccounting("Jason",554, "Manager", 150000, 20);
        System.out.println(myAcc2.experience);
    }
}
