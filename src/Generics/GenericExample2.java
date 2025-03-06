package Generics;

import java.util.HashMap;
import java.util.Map;

public class GenericExample2 {

    public static void main(String[] args) {
        Map<Integer,String> map = map(1 ," one");
        Map<String,String> map2 = map("second "," position");
        System.out.println(map);
        System.out.println(map2);
    }

    public static <K,V> Map<K,V> map(K k, V v) {
        Map<K,V> map = new HashMap<>();
        map.put(k,v);
        return map;
    }
}
