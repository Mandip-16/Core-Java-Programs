package Constructor.ConstructorOverloading;

class Employee {
    String name;
    int id;
    String department;
    double salary;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
        this.department = "Not Assigned";
        this.salary = 0.0;
    }

    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = 0.0;
    }

    public Employee(String name, int id, String department, double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}