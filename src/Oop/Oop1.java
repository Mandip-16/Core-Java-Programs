package Oop;

public class Oop1 {

    public static void main(String[] args) {
        Person person = new Person("Mandeep", 25);
        person.displayDetails();

        Person person1 = new Person("",30);
        person1.displayDetails();

        Person person2 = new Person(" ",-12);
        person2.displayDetails();

        Person person3 = new Person(null,23);
        person3.displayDetails();
    }

     public static class Person{
        String name;
        int age;

        Person(String name, int age){
            this.name = name;
            this.age = age;
        }

        public void displayDetails(){
            System.out.println("Name: "+name+" Age: "+age);
        }
    }
}


