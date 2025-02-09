import org.w3c.dom.ls.LSOutput;

public class Employee {
    private String name;
    private String id;
    private int salary;

    public Employee(String name, String id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary(int salary){
        salary = salary *12;
        return salary;
    }
    public int raiseSalary(int salary){
        salary += salary;
        return salary;
    }
    public String toString(){
        return "Name: " + name + " ID: " + id + " Salary: " + salary;
    }
}
