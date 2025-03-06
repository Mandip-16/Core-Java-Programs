package Java8.LearnFunctionalInterfaceDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class LearnFunctionInterface {

    public static void main(String[] args) {
        Function<String,Integer> fun = x -> x.length();
        Function<String,String> fun2 = x -> x.substring(0,3);
        System.out.println(fun.apply("mandeep"));
        System.out.println(fun2.apply("mandeep"));

        Function<List<Student>,List<Student>> studetnWithmanPrefix = li -> {
            List<Student> result = new ArrayList<>();
            for (Student s : li) {
                if(fun2.apply(s.getName()).equalsIgnoreCase("man"));
                result.add(s);
            }
            return result;
        };

        Student s1 = new Student("Mandeep",1);
        Student s2 = new Student("Manish",2);
        Student s3 = new Student("anju",3);
        Student s4 = new Student("deep",4);
        List<Student> list = Arrays.asList(s1,s2,s3,s4);

        List<Student> result = studetnWithmanPrefix.apply(list);
        System.out.println(result);

        Function<Integer,Integer> fun3 = x -> x * 2;
        Function<Integer,Integer> fun4 = x -> x * x * x;
        System.out.println(fun3.andThen(fun4).apply(3));

        //below both are same
        System.out.println(fun4.andThen(fun3).apply(3));
        System.out.println(fun3.compose(fun4).apply(3));
    }

    private static class Student {
        private String name;
        private int id;

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    '}';
        }

        public Student(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
}
