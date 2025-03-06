package CollectionFramework.List;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // add(E e)
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("Initial CollectionFramework.List: " + list);

        // add(int index, E element)
        list.add(1, "Blueberry");
        System.out.println("After adding Blueberry at index 1: " + list);

        // addAll(Collection<E> c)
        List<String> newList = Arrays.asList("Orange", "Mango");
        list.addAll(newList);
        System.out.println("After addAll: " + list);

        // addAll(int index, Collection<E> c)
        List<String> anotherList = Arrays.asList("Grapes", "Pineapple");
        list.addAll(2, anotherList);
        System.out.println("After addAll at index 2: " + list);

        // addFirst(E e)
        list.addFirst("Strawberry");
        System.out.println("After addFirst: " + list);

        // addLast(E e)
        list.addLast("Watermelon");
        System.out.println("After addLast: " + list);

        // clone()
        LinkedList<String> clonedList = (LinkedList<String>) list.clone();
        System.out.println("Cloned CollectionFramework.List: " + clonedList);

        // contains(Object o)
        System.out.println("Contains 'Mango': " + list.contains("Mango"));

        // descendingIterator()
        Iterator<String> descIterator = list.descendingIterator();
        System.out.print("Elements in reverse order: ");
        while (descIterator.hasNext()) {
            System.out.print(descIterator.next() + " ");
        }
        System.out.println();

        // element()
        System.out.println("Head element: " + list.element());

        // get(int index)
        System.out.println("Element at index 3: " + list.get(3));

        // getFirst() and getLast()
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        // indexOf and lastIndexOf
        System.out.println("Index of 'Cherry': " + list.indexOf("Cherry"));
        System.out.println("Last index of 'Banana': " + list.lastIndexOf("Banana"));

        // offer, offerFirst, offerLast
        list.offer("Peach");
        list.offerFirst("Guava");
        list.offerLast("Plum");
        System.out.println("After offers: " + list);

        // peek, peekFirst, peekLast
        System.out.println("Peek: " + list.peek());
        System.out.println("PeekFirst: " + list.peekFirst());
        System.out.println("PeekLast: " + list.peekLast());

        // poll, pollFirst, pollLast
        list.poll();
        list.pollFirst();
        list.pollLast();
        System.out.println("After polls: " + list);

        // push and pop
        list.push("Papaya");
        System.out.println("After push: " + list);
        list.pop();
        System.out.println("After pop: " + list);

        // remove, removeFirst, removeLast
        list.remove("Apple");
        list.removeFirst();
        list.removeLast();
        System.out.println("After removals: " + list);

        // set(int index, E element)
        list.set(1, "Kiwi");
        System.out.println("After set(1, 'Kiwi'): " + list);

        // size()
        System.out.println("Size of list: " + list.size());

        // toArray()
        Object[] array = list.toArray();
        System.out.println("Array from list: " + Arrays.toString(array));

        // clear()
        list.clear();
        System.out.println("After clear(): " + list);
    }
}

