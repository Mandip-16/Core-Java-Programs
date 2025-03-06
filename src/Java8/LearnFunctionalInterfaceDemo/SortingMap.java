package Java8.LearnFunctionalInterfaceDemo;

import java.util.TreeMap;

public class SortingMap {
    public static void main(String[] args) {
        TreeMap<Integer,String> m = new TreeMap<>((i1,i2)->(i1>i2)?-1:(i1<i2)?1:0);
        m.put(2,"man");
        m.put(1,"deep");
        m.put(4,"mandeep");
        m.put(3,"md");
        System.out.println(m);
    }
}
