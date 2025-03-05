package DesignPattern.Factory;

public class EmployeeFactory {

    public static Employee getEmployee(String EmpType) {
        if(EmpType.trim().equalsIgnoreCase("android developer")) {
            return new AndoridDeveloper();
        } else if (EmpType.trim().equalsIgnoreCase("web developer")) {
            return new WebDeveloper();
        } else {
            return null;
        }
    }
}
