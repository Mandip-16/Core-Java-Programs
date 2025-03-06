package CollectionFramework.Set;

import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        // add() and addAll()
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        List<Integer> list = Arrays.asList(60, 70, 80);
        treeSet.addAll(list);
        System.out.println("TreeSet after add and addAll: " + treeSet);

        // ceiling()
        System.out.println("Ceiling of 35: " + treeSet.ceiling(35));

        // clear()
        TreeSet<Integer> tempSet = new TreeSet<>(treeSet);
        tempSet.clear();
        System.out.println("TreeSet after clear: " + tempSet);

        // clone()
        TreeSet<Integer> clonedSet = (TreeSet<Integer>) treeSet.clone();
        System.out.println("Cloned TreeSet: " + clonedSet);

        // comparator()
        System.out.println("Comparator used: " + treeSet.comparator());

        // contains()
        System.out.println("TreeSet contains 20: " + treeSet.contains(20));

        // descendingIterator()
        System.out.print("Elements in descending order: ");
        Iterator<Integer> descIterator = treeSet.descendingIterator();
        while (descIterator.hasNext()) {
            System.out.print(descIterator.next() + " ");
        }
        System.out.println();

        // descendingSet()
        System.out.println("Descending set view: " + treeSet.descendingSet());

        // first() and last()
        System.out.println("First element: " + treeSet.first());
        System.out.println("Last element: " + treeSet.last());

        // floor()
        System.out.println("Floor of 45: " + treeSet.floor(45));

        // headSet()
        System.out.println("HeadSet (less than 40): " + treeSet.headSet(40));

        // higher() and lower()
        System.out.println("Higher than 40: " + treeSet.higher(40));
        System.out.println("Lower than 40: " + treeSet.lower(40));

        // pollFirst() and pollLast()
        System.out.println("Poll first element: " + treeSet.pollFirst());
        System.out.println("Poll last element: " + treeSet.pollLast());
        System.out.println("TreeSet after pollFirst and pollLast: " + treeSet);

        // remove()
        treeSet.remove(30);
        System.out.println("TreeSet after removing 30: " + treeSet);

        // size() and isEmpty()
        System.out.println("Size of TreeSet: " + treeSet.size());
        System.out.println("Is TreeSet empty? " + treeSet.isEmpty());

        // subSet() and tailSet()
        System.out.println("Subset (20 to 60): " + treeSet.subSet(20, 60));
        System.out.println("TailSet (40 and above): " + treeSet.tailSet(40));

        // spliterator()
        Spliterator<Integer> spliterator = treeSet.spliterator();
        System.out.print("Spliterator output: ");
        spliterator.forEachRemaining(System.out::print);
    }
}
