package Queues.Problem2;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Company {
    private Queue<Department> departments = new LinkedList<Department>();
    private Department searchedDep; //stores searched for department
    private Employee searchedEmp; //stores searched for employee
    private int counter; //counter used for payroll

    // creates a new department
    public void addDepartment(String name) {
        departments.add(new Department(name.toUpperCase()));
        System.out.print("Department " + name.toUpperCase() + " added!\n");
    }
    // searches for a department by name
    public Boolean searchDepartment(String departmentName) {
        for(Department dep: departments) {
            if(dep.getDepartmentName().equalsIgnoreCase(departmentName)) {
                searchedDep = dep;
                return true;
            }
        }
        return false;
    }
    // searches for an employee by name
    public Boolean searchEmployee(String name, String departmentName) {
        if(searchDepartment(departmentName)) {
            for(Employee emp: searchedDep.getEmployees()) {
                if(emp.getName().equalsIgnoreCase(name)) {
                    searchedEmp = emp;
                    return true;
                }
            }
        }
        return false;
    }
    // hires an employee to a department
    public void hire(String name, String departmentName) {
        if(searchDepartment(departmentName)) {
            searchedDep.addEmployee(name);
            System.out.print(name + " hired for " + departmentName + "\n");
        }
        else {
            System.out.print("Department " + departmentName + " does not exist\n");
        }
    }
    // gets salary for specific employee
    public void salary(String name, String departmentName) {
        setPay();
        if(searchEmployee(name, departmentName)) {
            System.out.print("Name:" + name + "\n");
            System.out.print("Salary: " + searchedEmp.getSalary() + "\n");
        }
        else {
            System.out.print("Employee " + name + " does not exist in " + departmentName + "\n");
                if(!searchDepartment(departmentName)) {
                    System.out.print("Department " + departmentName + " does not exist\n");
                }
        }
    }     
    // fire/quit an employee
    public void quit(String name, String departmentName) {
        if(searchEmployee(name, departmentName)) {
            searchedEmp.setEmployed(false);
            System.out.println(name + " quit!");
        }
        else {
            System.out.print("Employee " + name + " does not exist in " + departmentName + "\n");
            if(!searchDepartment(departmentName)) {
                System.out.print("Department " + departmentName + " does not exist\n");
            }
        }
    }
    // employee switches department
    public void change(String name, String currentDepartment, String newDepartment) {
        String nameHolder; // stores name before moving employee
        int salaryHolder; // stores salary before moving employee
        if(searchEmployee(name,currentDepartment)) {
            searchedEmp.setEmployed(false);
            nameHolder = searchedEmp.getName();
            salaryHolder = searchedEmp.getSalary();

            if(searchDepartment(newDepartment)) {
                searchedDep.addEmployee(nameHolder);
                searchEmployee(nameHolder,newDepartment);
                searchedEmp.setSalary(salaryHolder);
            }
            else {
                System.out.print("Department " + currentDepartment + " does not exist\n");
            }    
            print();
        }
        else {
            System.out.print("Employee " + name + " does not exist in " + currentDepartment + "\n");
                if(!searchDepartment(currentDepartment)) {
                    System.out.print("Department " + currentDepartment + " does not exist\n");
                }
        } 
    }
    // sets salary based on # of employees in each department
    public void setPay() {
        for(Department dep: departments) {
            counter = dep.getEmployees().size();
            for(Employee emp: dep.getEmployees()) {
                emp.addSalary(500 * (counter - 1));
                counter--;
            }
        }
    }
    // prints list of all employees in each department and their pay
    public void print() {
        setPay();
        System.out.println("\nAll Departments: ");
        for(Department dep: departments) {
            System.out.println("\n" + dep.getDepartmentName());
            for(Employee x: dep.getEmployees()) {
                if(x.getEmployed()) {
                    System.out.println(x.getName() + " $" + x.getSalary());
                }
            }
            System.out.println();
        }
    }
    // command menu
    public void menu() {
        // TESTING ONLY *****************************
        // if(departments.isEmpty()) {
        //         addDepartment("sales");
        //         addDepartment("hr");
        //         addDepartment("service");
        //         hire("Mike","sales");
        //         hire("Jeff","sales");
        //         hire("Travis","sales");
        //         hire("Tom","hr");
        //         hire("Katy","hr");
        //         hire("Jack","service");
        //         System.out.println();
        //     }
        // ******************************************
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Add | Hire | Quit | Change | Payroll | Salary | Exit");

            String input = scan.nextLine();
            String input2;
            String input3;

            if(input.equalsIgnoreCase("add")) {
                System.out.println("Department Name: ");
                input = scan.nextLine();
                addDepartment(input.toUpperCase());
            }
            else if(input.equalsIgnoreCase("hire")) {
                System.out.println("Employee Name: ");
                input = scan.nextLine();
                
                System.out.println("Assigned Department: ");
                input2 = scan.nextLine().toUpperCase().toString();

                hire(input,input2);
            }
            else if(input.equalsIgnoreCase("change")) {
                System.out.println("Employee Name: ");
                input = scan.nextLine();
                
                System.out.println("Current Department: ");
                input2 = scan.nextLine().toUpperCase().toString();
                
                System.out.println("New Department: ");
                input3 = scan.nextLine().toUpperCase();

                change(input,input2,input3);
            }
            else if(input.equalsIgnoreCase("quit")) {
                System.out.println("Employee Name: ");
                input = scan.nextLine();
                
                System.out.println("Assigned Department: ");
                input2 = scan.nextLine().toUpperCase().toString();
                quit(input,input2);
            }
            else if(input.equalsIgnoreCase("payroll")) {
                print();
            }
            else if(input.equalsIgnoreCase("salary")) {
                System.out.println("Employee Name: ");
                input = scan.nextLine();
                
                System.out.println("Assigned Department: ");
                input2 = scan.nextLine().toUpperCase().toString();

                salary(input,input2);

            }
            else if (input.equalsIgnoreCase("exit")) {
                System.exit(0);
            }
            else {
                System.out.print("Invalid input..\n");
            }
            menu();
        }
    }
}