package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

    public static void main(String[] args) {
        System.out.println(genericMethod("apple","mango"));
        System.out.println(genericMethod(100,200));
        System.out.println(genericMethod('a','b'));

        String s = genericMethod("mango","apple").get(0);
        System.out.println(s);

        Integer[] intArray = new Integer[] {1,2,3,4};
        Character[] charArray = new Character[] {'a','b','c','d'};

        printData(intArray);
        System.out.println();
        printData(charArray);
    }

    public static <T> void printData(T t[]) {
        for (T data: t) {
            System.out.print(data);
        }
    }

    static <T> List<T> genericMethod(T s1, T s2) {
        List<T> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        return list;
    }
}
