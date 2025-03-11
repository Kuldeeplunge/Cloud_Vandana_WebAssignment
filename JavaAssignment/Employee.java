import java.util.*;
public class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]");
    }
    public static void main(String args[])
    {
        Employee e1=new Employee(1,"Ram",39000);
        Employee e2=new Employee(2,"Krish",85000);
        Employee e3=new Employee(3,"Abhay",66000);
        List<Employee> employees=new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        for(Employee e:employees)
        {
            e.displayDetails();
        }
    }
}