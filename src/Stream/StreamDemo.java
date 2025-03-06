package Stream;

import java.util.*;
import java.util.stream.*;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Creating a Stream
        System.out.println("Original CollectionFramework.List:");
        names.stream().forEach(System.out::println);

        // Filtering elements
        System.out.println("\nNames starting with 'C':");
        names.stream()
                .filter(name -> name.startsWith("C"))
                .forEach(System.out::println);

        // Mapping elements
        System.out.println("\nNames in uppercase:");
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        // Sorting elements
        System.out.println("\nSorted names:");
        names.stream()
                .sorted()
                .forEach(System.out::println);

        // Collecting elements
        System.out.println("\nCollected names into a list:");
        List<String> collectedNames = names.stream()
                .filter(name -> name.length() > 3)
                .collect(Collectors.toList());
        System.out.println(collectedNames);

        // Reducing elements
        System.out.println("\nReduced names to a single string:");
        Optional<String> reduced = names.stream()
                .reduce((name1, name2) -> name1 + ", " + name2);
        reduced.ifPresent(System.out::println);

        // Counting elements
        System.out.println("\nCount of names with length > 3:");
        long count = names.stream()
                .filter(name -> name.length() > 3)
                .count();
        System.out.println(count);

        // Finding elements
        System.out.println("\nFind any name starting with 'A':");
        names.stream()
                .filter(name -> name.startsWith("A"))
                .findAny()
                .ifPresent(System.out::println);

        // Matching elements
        System.out.println("\nCheck if any name starts with 'D':");
        boolean anyMatch = names.stream()
                .anyMatch(name -> name.startsWith("D"));
        System.out.println(anyMatch);

        // Parallel stream example
        System.out.println("\nParallel Stream Example:");
        names.parallelStream()
                .map(String::toLowerCase)
                .forEach(System.out::println);

        // Distinct elements
        System.out.println("\nDistinct elements in the list:");
        List<String> duplicateNames = Arrays.asList("Alice", "Bob", "Alice", "Charlie", "Bob");
        duplicateNames.stream()
                .distinct()
                .forEach(System.out::println);

        // Limit and Skip
        System.out.println("\nFirst 3 elements:");
        numbers.stream()
                .limit(3)
                .forEach(System.out::println);

        System.out.println("\nSkipping first 5 elements:");
        numbers.stream()
                .skip(5)
                .forEach(System.out::println);

        // FlatMap example
        System.out.println("\nFlatMap Example:");
        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );
        nestedList.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);

        // Generating streams
        System.out.println("\nGenerated stream of 5 random numbers:");
        Stream.generate(() -> new Random().nextInt(100))
                .limit(5)
                .forEach(System.out::println);

        // Stream.of example
        System.out.println("\nStream.of example:");
        Stream.of("Java", "Python", "C++", "JavaScript")
                .forEach(System.out::println);

        // Peek (for debugging)
        System.out.println("\nPeek Example:");
        names.stream()
                .peek(name -> System.out.println("Processing: " + name))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        // Min and Max
        System.out.println("\nMin and Max Example:");
        numbers.stream().min(Integer::compareTo).ifPresent(min -> System.out.println("Min: " + min));
        numbers.stream().max(Integer::compareTo).ifPresent(max -> System.out.println("Max: " + max));

        // Collecting to a CollectionFramework.Map
        System.out.println("\nCollecting to a CollectionFramework.Map:");
        Map<String, Integer> nameLengthMap = names.stream()
                .collect(Collectors.toMap(name -> name, String::length));
        nameLengthMap.forEach((name, length) -> System.out.println(name + " -> " + length));

        // Grouping elements
        System.out.println("\nGrouping by length:");
        Map<Integer, List<String>> groupedByLength = names.stream()
                .collect(Collectors.groupingBy(String::length));
        groupedByLength.forEach((length, nameList) -> System.out.println(length + " letters: " + nameList));
    }
}

