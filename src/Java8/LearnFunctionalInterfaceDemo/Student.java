package Java8.LearnFunctionalInterfaceDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Student {
    int no;
    String name;

    Student(int no,String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}

class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(2,"man"));
        list.add(new Student(4,"md"));
        list.add(new Student(3,"deep"));
        list.add(new Student(1,"mandeep"));
        list.add(new Student(5,"patel"));
        System.out.println(list);
        Collections.sort(list,(i1,i2)->(i1.no< i2.no)?-1:(i1.no>i2.no)?1:0);
        System.out.println(list);
        Collections.sort(list,(i1,i2)->(i1.no< i2.no)?1:(i1.no>i2.no)?-1:0);
        System.out.println(list);
    }
}