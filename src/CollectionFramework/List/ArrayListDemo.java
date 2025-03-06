package CollectionFramework.List;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // add(Object o)
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("Initial CollectionFramework.List: " + list);

        // add(int index, Object element)
        list.add(1, "Blueberry");
        System.out.println("After adding Blueberry at index 1: " + list);

        // addAll(Collection C)
        List<String> newList = Arrays.asList("Orange", "Mango");
        list.addAll(newList);
        System.out.println("After addAll: " + list);

        // addAll(int index, Collection C)
        List<String> anotherList = Arrays.asList("Grapes", "Pineapple");
        list.addAll(2, anotherList);
        System.out.println("After addAll at index 2: " + list);

        // clone()
        ArrayList<String> clonedList = (ArrayList<String>) list.clone();
        System.out.println("Cloned CollectionFramework.List: " + clonedList);

        // contains(Object o)
        System.out.println("Contains 'Mango': " + list.contains("Mango"));

        // ensureCapacity(int minCapacity)
        list.ensureCapacity(20);

        // get(int index)
        System.out.println("Element at index 3: " + list.get(3));

        // indexOf(Object O)
        System.out.println("Index of 'Cherry': " + list.indexOf("Cherry"));

        // isEmpty()
        System.out.println("Is list empty? " + list.isEmpty());

        // lastIndexOf(Object O)
        System.out.println("Last index of 'Banana': " + list.lastIndexOf("Banana"));

        // listIterator()
        ListIterator<String> iterator = list.listIterator();
        System.out.print("CollectionFramework.List elements using listIterator: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // remove(int index)
        list.remove(2);
        System.out.println("After removing element at index 2: " + list);

        // remove(Object o)
        list.remove("Apple");
        System.out.println("After removing 'Apple': " + list);

        // removeAll(Collection c)
        list.removeAll(newList);
        System.out.println("After removeAll: " + list);

        // removeIf(Predicate filter)
        list.removeIf(element -> element.startsWith("P"));
        System.out.println("After removeIf (starts with 'P'): " + list);

        // set(int index, E element)
        list.set(1, "Kiwi");
        System.out.println("After set(1, 'Kiwi'): " + list);

        // size()
        System.out.println("Size of list: " + list.size());

        // subList(int fromIndex, int toIndex)
        List<String> subList = list.subList(0, 2);
        System.out.println("SubList (0 to 2): " + subList);

        // toArray()
        Object[] array = list.toArray();
        System.out.println("Array from list: " + Arrays.toString(array));

        // trimToSize()
        list.trimToSize();

        // clear()
        list.clear();
        System.out.println("After clear(): " + list);
    }
}

