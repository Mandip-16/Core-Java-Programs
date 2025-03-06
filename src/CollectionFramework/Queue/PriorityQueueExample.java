package CollectionFramework.Queue;

import java.util.*;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements
        pq.add(10);
        pq.add(20);
        pq.add(15);
        pq.add(5);
        pq.add(30);

        System.out.println("PriorityQueue: " + pq);

        // Peek at the head element
        System.out.println("Peek: " + pq.peek());

        // Remove the head element
        System.out.println("Poll: " + pq.poll());
        System.out.println("PriorityQueue after poll: " + pq);

        // Check if an element exists
        System.out.println("Contains 20? " + pq.contains(20));

        // Remove an element
        pq.remove(20);
        System.out.println("PriorityQueue after removing 20: " + pq);

        // Check size
        System.out.println("Size: " + pq.size());

        // Convert to array
        Object[] array = pq.toArray();
        System.out.println("Array: " + Arrays.toString(array));

        // Iterate through elements
        System.out.println("Iterating over elements:");
        for (Integer element : pq) {
            System.out.println(element);
        }

        // Clear the queue
        pq.clear();
        System.out.println("PriorityQueue after clear: " + pq);

        // Check if empty
        System.out.println("Is empty? " + pq.isEmpty());
    }
}

/*
- add() : Inserts the element
- offer() : Similar to add(), returns false if insertion fails
- peek() : Retrieves the head without removing it
- poll() : Retrieves and removes the head
- remove() : Removes a specific element
- contains() : Checks if an element exists
- size() : Returns the number of elements
- toArray() : Converts the queue to an array
- clear() : Empties the queue
- isEmpty() : Checks if the queue is empty
*/

