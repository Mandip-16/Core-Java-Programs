package CollectionFramework.List;

import java.util.*;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // push(E item)
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        System.out.println("Initial Stack: " + stack);

        // pop()
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // peek()
        System.out.println("Top element (peek): " + stack.peek());

        // search(Object o)
        int position = stack.search("Apple");
        System.out.println("Position of 'Apple': " + position);

        // empty()
        System.out.println("Is stack empty? " + stack.empty());

        // add(E item) - inherited from Vector
        stack.add("Orange");
        System.out.println("Stack after add: " + stack);

        // add(int index, E element)
        stack.add(1, "Blueberry");
        System.out.println("Stack after adding at index 1: " + stack);

        // remove(int index)
        stack.remove(1);
        System.out.println("Stack after removing element at index 1: " + stack);

        // contains(Object o)
        System.out.println("Contains 'Banana'? " + stack.contains("Banana"));

        // size()
        System.out.println("Stack size: " + stack.size());

        // toArray()
        Object[] array = stack.toArray();
        System.out.println("Array from stack: " + Arrays.toString(array));

        // clear()
        stack.clear();
        System.out.println("Stack after clear(): " + stack);
    }
}

