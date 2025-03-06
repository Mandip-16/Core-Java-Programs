package DesignPattern.Factory;

public class AndoridDeveloper implements Employee{


    @Override
    public int salary() {
        System.out.println("Android developer salary is : ");
        return 50000;
    }
}
