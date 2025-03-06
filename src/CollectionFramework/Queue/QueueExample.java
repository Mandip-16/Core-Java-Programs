package CollectionFramework.Queue;

import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        // Create a CollectionFramework.Queue (LinkedList implementation)
        Queue<String> queue = new LinkedList<>();

        // Add elements
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Orange");
        queue.offer("Grapes");

        System.out.println("CollectionFramework.Queue: " + queue);

        // Peek at the head element
        System.out.println("Peek: " + queue.peek());

        // Remove the head element
        System.out.println("Poll: " + queue.poll());
        System.out.println("CollectionFramework.Queue after poll: " + queue);

        // Remove a specific element
        queue.remove("Banana");
        System.out.println("CollectionFramework.Queue after removing Banana: " + queue);

        // Check if an element exists
        System.out.println("Contains Orange? " + queue.contains("Orange"));

        // Check size
        System.out.println("Size: " + queue.size());

        // Convert to array
        Object[] array = queue.toArray();
        System.out.println("Array: " + Arrays.toString(array));

        // Iterate through elements
        System.out.println("Iterating over elements:");
        for (String element : queue) {
            System.out.println(element);
        }

        // Clear the queue
        queue.clear();
        System.out.println("CollectionFramework.Queue after clear: " + queue);

        // Check if empty
        System.out.println("Is empty? " + queue.isEmpty());
    }
}

