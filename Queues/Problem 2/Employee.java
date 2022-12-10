public class Employee {
    private int salary;
    private String name;
    private Boolean employed;

    public Employee(String name) {
        this.salary = 40000;
        this.name = name;
        this.employed = true;
    }

    public int getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    public Boolean getEmployed() {
        return employed;
    }
    public void addSalary(int salary) {
        this.salary += salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void setEmployed(Boolean employed) {
        this.employed = employed;
    }
    
     
}

