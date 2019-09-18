package CreatingClasses;

public class Employee {
    String name;
    int id;
    String department;
    double salary;
    String contractType;
    Employee(){
        this.name="Temp";
        this.id= 123;
        this.department= "New";
        this.salary= 15000.00;
        this.contractType= "Later";
    }
    Employee(String name, int id, String department, double salary, String contractType){
        this.name= name;
        this.id= id;
        this.department= department;
        this.salary= salary;
        this.contractType= contractType;
    }
    public double calculateWeeklyPayment(int weeks){
        double weeklyPayment;
        weeklyPayment=(this.salary/52)* weeks;
        return weeklyPayment;
    }
    public double calculateBiWeeklyPayment(int weeks){
        double biWeeklyPayment;
        biWeeklyPayment= (this.salary/52)*weeks;
        return biWeeklyPayment;
    }
    public void displayEmployeeInfo(){
        System.out.println("Employee Name : " + this.name);
        System.out.println("Employee Department : " +this.department);
        System.out.println("Employee Id : " + this.id);
        System.out.println("Employee Salary  : " + this.salary);
        System.out.println("Employee Contract Type : " + this.contractType);
    }

}
