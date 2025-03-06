package DefaultAndStatic;

public interface Interf {

    default void m1() {
        System.out.println("hello mandeep");
    }
}

//class Test implements Interf {
//    public static void main(String[] args) {
//        Test test = new Test();
//        test.m1();
//    }
//}

class Test implements Interf {
    public void m1() {
        System.out.println("hi mandeep");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.m1();
    }
}

// Note :- default method is used by child which implements the interface and also child override the default method in
//         it's class  both scenario are described in above code.

