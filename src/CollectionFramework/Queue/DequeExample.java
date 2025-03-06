package CollectionFramework.Queue;

import java.util.*;

public class DequeExample {
    public static void main(String[] args) {
        // Create a Deque (LinkedList implementation)
        Deque<String> deque = new LinkedList<>();

        // Add elements to the front and back
        deque.add("Apple");
        deque.addFirst("Orange");
        deque.addLast("Banana");
        deque.offer("Grapes");
        deque.offerFirst("Pineapple");
        deque.offerLast("Mango");

        System.out.println("Deque: " + deque);

        // Peek and get elements
        System.out.println("Peek First: " + deque.peekFirst());
        System.out.println("Peek Last: " + deque.peekLast());
        System.out.println("Element: " + deque.element());
        System.out.println("Get First: " + deque.getFirst());
        System.out.println("Get Last: " + deque.getLast());

        // Remove elements from the front and back
        System.out.println("Poll First: " + deque.pollFirst());
        System.out.println("Poll Last: " + deque.pollLast());
        System.out.println("Deque after polling: " + deque);

        // Add and remove elements
        deque.add("Kiwi");
        deque.remove("Banana");

        // Check size and contains
        System.out.println("Size: " + deque.size());
        System.out.println("Contains Apple? " + deque.contains("Apple"));

        // Iterate with iterator and descending iterator
        System.out.println("Iterating with iterator:");
        Iterator<String> iterator = deque.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Iterating with descending iterator:");
        Iterator<String> descIterator = deque.descendingIterator();
        while (descIterator.hasNext()) {
            System.out.println(descIterator.next());
        }

        // Convert to array
        Object[] array = deque.toArray();
        System.out.println("Array: " + Arrays.toString(array));

        // Clear the deque
        deque.clear();
        System.out.println("Deque after clear: " + deque);

        // Check if empty
        System.out.println("Is empty? " + deque.isEmpty());
    }
}

/*
- add(), addFirst(), addLast() : Add elements to the front, back, or tail
- offer(), offerFirst(), offerLast() : Add elements with failure handling
- peekFirst(), peekLast(), element() : View elements from the front and back
- getFirst(), getLast() : Retrieve elements without removing
- pollFirst(), pollLast() : Remove and return elements from front/back
- remove() : Removes a specific element
- contains() : Checks if an element exists
- iterator(), descendingIterator() : Traverse elements in both orders
- size() : Returns the number of elements
- toArray() : Converts the deque to an array
- clear() : Empties the deque
- isEmpty() : Checks if the deque is empty
ArrayDeque is implement same method like deque
Note: ArrayDeque is faster than LinkedList for most cases and doesn’t allow null elements.
*/
