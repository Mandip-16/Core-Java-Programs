package DefaultAndStatic;

interface Left {
    default void m1() {
        System.out.println("hi");
    }
}

interface Right {
    default void m1() {
        System.out.println("hello");
    }
}

//here we are doing multiple inheritance
//here we solve a problem - ke both interface ni m1() method mathi test object kai method call kare che e comipler find
// na kari sake je error show kare
//solution - 1. method override kari do(provide own implementation)
//           2.bemathi koi pan ek parent interface ni method super vade call kari ne solve kari do
public class Test2 implements Left,Right {
    public void m1() {
//        System.out.println("namaste");
        Left.super.m1();
//        Right.super.m1();
    }
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.m1();
    }
}
