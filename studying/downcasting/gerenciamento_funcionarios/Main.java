import java.util.List;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        
        employees.add(new Employee("Alice", 5000));
        employees.add(new Manager("Bob", 7000, 1000));
        employees.add(new Developer("Charlie", 6000, "Java"));
        
        for (Employee employee : employees) {
            printEmployeeDetails(employee);
        }
        
        
    }
    
    public static void printEmployeeDetails(Employee employee) {

        if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            manager.printDetails();
        } else if (employee instanceof Developer) {
            Developer developer = (Developer) employee;
            developer.printDetails();
        } else {
            employee.printDetails();
        }
    }
}
