package Queues.Problem2;
import java.util.LinkedList;
import java.util.Queue;

public class Department {
    private Queue<Employee> employees = new LinkedList<Employee>();
    private String departmentName;

    public Department(String name) {
        this.departmentName = name;    
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public void addEmployee(String name) {
        Employee newEmployee = new Employee(name);
        // employees.add(new Employee(name));
        employees.add(newEmployee);
    }
    public Queue<Employee> getEmployees() {
        return employees;
    }   
}
