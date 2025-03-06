package CollectionFramework.Map;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        // Create a ConcurrentHashMap
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // Basic Operations
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        System.out.println("Initial CollectionFramework.Map: " + map);

        // Access elements
        System.out.println("Value for key 'Two': " + map.get("Two"));

        // Check key/value presence
        System.out.println("Contains key 'Three'? " + map.containsKey("Three"));
        System.out.println("Contains value 3? " + map.containsValue(3));

        // Remove elements
        map.remove("One");
        System.out.println("After removing key 'One': " + map);

        // Atomic operations
        map.putIfAbsent("Four", 4);
        System.out.println("After putIfAbsent('Four', 4): " + map);

        map.replace("Two", 22);
        System.out.println("After replace('Two', 22): " + map);

        map.replace("Three", 3, 33);
        System.out.println("After replace('Three', 3, 33): " + map);

        map.remove("Four", 44); // Will not remove as value doesn’t match
        System.out.println("After remove('Four', 44): " + map);

        // Bulk operations
        ConcurrentHashMap<String, Integer> newMap = new ConcurrentHashMap<>();
        newMap.put("Five", 5);
        newMap.put("Six", 6);
        map.putAll(newMap);
        System.out.println("After putAll(newMap): " + map);

        // View operations
        Set<String> keys = map.keySet();
        System.out.println("Key set: " + keys);

        Collection<Integer> values = map.values();
        System.out.println("Values: " + values);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        System.out.println("Entry set: " + entries);

        // Java 8+ methods
        map.compute("Five", (key, value) -> value != null ? value * 2 : 10);
        System.out.println("After compute('Five'): " + map);

        map.computeIfAbsent("Seven", key -> 7);
        System.out.println("After computeIfAbsent('Seven'): " + map);

        map.computeIfPresent("Six", (key, value) -> value * 10);
        System.out.println("After computeIfPresent('Six'): " + map);

        map.merge("Eight", 8, Integer::sum);
        System.out.println("After merge('Eight', 8, sum): " + map);

        // Final statistics
        System.out.println("Size: " + map.size());
        System.out.println("Mapping count: " + map.mappingCount());

        // Clear the map
        map.clear();
        System.out.println("After clear: " + map);
    }
}

