package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmpStreamDemo {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("John Doe", "IT", 60000));
        employees.add(new Employee("Alice Smith", "HR", 45000));
        employees.add(new Employee("Bob Johnson", "Finance", 70000));
        employees.add(new Employee("Emily Davis", "Marketing", 50000));

        List<String> richEmployee = employees.stream().filter(emp -> emp.getSalary()>50000)
                                    .sorted(Comparator.comparing(Employee::getName))
                                    .map(Employee::getName).collect(Collectors.toList());

        double averageSalary = employees.stream().mapToDouble(Employee::getSalary).average().orElse(0);

        System.out.println("Rich employees are : " + richEmployee);
        System.out.println("Average salary is : " + averageSalary);
    }
}
