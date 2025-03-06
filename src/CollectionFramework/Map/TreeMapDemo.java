package CollectionFramework.Map;

import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // put() and putAll()
        treeMap.put(1, "Apple");
        treeMap.put(2, "Banana");
        treeMap.put(3, "Orange");
        treeMap.put(4, "Mango");
        System.out.println("Initial TreeMap: " + treeMap);

        Map<Integer, String> extraMap = new HashMap<>();
        extraMap.put(5, "Grapes");
        extraMap.put(6, "Pineapple");
        treeMap.putAll(extraMap);
        System.out.println("After putAll: " + treeMap);

        // clear()
        TreeMap<Integer, String> tempMap = new TreeMap<>(treeMap);
        tempMap.clear();
        System.out.println("TreeMap after clear: " + tempMap);

        // clone()
        TreeMap<Integer, String> clonedMap = (TreeMap<Integer, String>) treeMap.clone();
        System.out.println("Cloned TreeMap: " + clonedMap);

        // containsKey() and containsValue()
        System.out.println("Contains key 3: " + treeMap.containsKey(3));
        System.out.println("Contains value 'Mango': " + treeMap.containsValue("Mango"));

        // entrySet()
        System.out.println("Entry set: " + treeMap.entrySet());

        // firstKey() and lastKey()
        System.out.println("First key: " + treeMap.firstKey());
        System.out.println("Last key: " + treeMap.lastKey());

        // get()
        System.out.println("Value for key 2: " + treeMap.get(2));

        // headMap()
        System.out.println("HeadMap (keys < 4): " + treeMap.headMap(4));

        // keySet()
        System.out.println("Key set: " + treeMap.keySet());

        // remove()
        treeMap.remove(3);
        System.out.println("After removing key 3: " + treeMap);

        // size()
        System.out.println("Size of TreeMap: " + treeMap.size());

        // subMap()
        System.out.println("SubMap (keys 2 to 5): " + treeMap.subMap(2, 5));

        // values()
        System.out.println("Values: " + treeMap.values());
    }
}

