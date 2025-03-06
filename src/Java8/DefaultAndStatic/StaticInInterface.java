package DefaultAndStatic;

interface Interf2 {
    public static void m1() {
        System.out.println("interface static method is called");
    }
}

public class StaticInInterface {
    public static void main(String[] args) {
        StaticInInterface obj = new StaticInInterface();
        /*obj.m1();
        StaticInInterface.m1();*/ //both methods are wrong for calling static m1() method of interface
                                 //becuse only using interface name you can access static method of interface
        Interf2.m1();
    }
}
