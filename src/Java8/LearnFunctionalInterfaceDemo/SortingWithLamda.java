package Java8.LearnFunctionalInterfaceDemo;

import java.util.ArrayList;
import java.util.Collections;

public class SortingWithLamda {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(1);
        list.add(15);
        list.add(10);
        list.add(0);
        Collections.sort(list,(i1,i2)->(i1>i2)?-1:(i1<i2)?1:0);
        System.out.println(list);
    }
}
