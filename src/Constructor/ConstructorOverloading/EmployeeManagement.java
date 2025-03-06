package Constructor.ConstructorOverloading;

public class EmployeeManagement {

    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 101);
        Employee emp2 = new Employee("Jane Smith", 102, "Marketing");
        Employee emp3 = new Employee("Emily Johnson", 103, "Engineering", 75000.00);

        emp1.displayEmployeeInfo();
        System.out.println("--------------------");
        emp2.displayEmployeeInfo();
        System.out.println("--------------------");
        emp3.displayEmployeeInfo();
    }
}
