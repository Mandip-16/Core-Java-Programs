package Java8.LearnFunctionalInterfaceDemo;

import java.util.TreeSet;

public class SortingSet {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>((i1,i2)->(i1>i2)?-1:(i1<i2)?1:0);
        t.add(2);
        t.add(27);
        t.add(10);
        t.add(40);
        t.add(32);
        System.out.println(t);
    }
}
