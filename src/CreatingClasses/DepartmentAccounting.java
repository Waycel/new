package CreatingClasses;

public class DepartmentAccounting extends Department {
    int experience;
    public DepartmentAccounting (String name, int id, String position, double salary,int experience){
        super( name, id, position,salary);
        this.experience= experience;
    }
    public void addExperience( int newExperience){
        this.experience= this.experience + newExperience;

    }


    public String toString() {
        return "DepartmentAccounting{" +
                "experience=" + experience +
                ", employeeName='" + employeeName + '\'' +
                ", employeeID=" + employeeID +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
