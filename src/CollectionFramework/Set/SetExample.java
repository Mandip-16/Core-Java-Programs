package CollectionFramework.Set;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        // Create a CollectionFramework.Set using HashSet
        Set<String> set = new HashSet<>();

        // Add elements
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Grapes");
        set.add("Kiwi");

        System.out.println("CollectionFramework.Set: " + set);

        // Add duplicate element
        set.add("Apple"); // Won't be added since sets don't allow duplicates
        System.out.println("CollectionFramework.Set after adding duplicate: " + set);

        // Add all elements from another collection
        Set<String> moreFruits = new HashSet<>(Arrays.asList("Mango", "Papaya"));
        set.addAll(moreFruits);
        System.out.println("CollectionFramework.Set after addAll: " + set);

        // Check for element existence
        System.out.println("Contains Banana? " + set.contains("Banana"));

        // Check if set contains all elements of another collection
        System.out.println("Contains all elements of moreFruits? " + set.containsAll(moreFruits));

        // Get hash code of the set
        System.out.println("CollectionFramework.Set hash code: " + set.hashCode());

        // Remove an element
        set.remove("Grapes");
        System.out.println("CollectionFramework.Set after removal: " + set);

        // Remove all elements from another collection
        set.removeAll(moreFruits);
        System.out.println("CollectionFramework.Set after removeAll: " + set);

        // Retain only the elements in another collection
        set.retainAll(Collections.singleton("Apple"));
        System.out.println("CollectionFramework.Set after retainAll: " + set);

        // Iterate through the set
        System.out.println("Iterating through the set:");
        for (String element : set) {
            System.out.println(element);
        }

        // Convert to array
        Object[] array = set.toArray();
        System.out.println("Array: " + Arrays.toString(array));

        // Get set size
        System.out.println("CollectionFramework.Set size: " + set.size());

        // Check if set is empty
        System.out.println("Is empty? " + set.isEmpty());

        // Clear the set
        set.clear();
        System.out.println("CollectionFramework.Set after clear: " + set);
    }
}

//Note: HashSet is unordered, while LinkedHashSet maintains insertion order, and TreeSet sorts elements.

