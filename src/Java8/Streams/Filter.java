package Java8.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter {

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(0);
        l.add(20);
        l.add(3);
        l.add(15);
        l.add(25);
        List<Integer> l1 = l.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(l1);
        List<Integer> l2 = l.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(l2);
        List<Integer> l3 = l.stream().sorted().collect(Collectors.toList());
        System.out.println(l3);
        //reverse sorted order(decreasing)
        List<Integer> l4 = l.stream().sorted((i1,i2)->(i1>i2)?-1:(i1<i2)?1:0).collect(Collectors.toList());
        //above line was write like below ,also you can write i2.compareTo(i1) for getting decreasing order
        List<Integer> l5 = l.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println(l4);
        System.out.println(l5);

        //find minimum
        Integer min = l.stream().min((i1, i2)->i1.compareTo(i2)).get();
        System.out.println(min);

        //find maximum
        Integer max = l.stream().max((i1, i2)->i1.compareTo(i2)).get();
        System.out.println(max);

        //toArray() method - used for copy elements from the stream to specified array
        Integer[] array = l.stream().toArray(Integer[]::new);
        for (Integer x : array) {
            System.out.println(x);
        }


        ArrayList<String> list = new ArrayList<>();
        list.add("mandeep");
        list.add("deep");
        list.add("man");
        list.add("ab");
        List<String> list1 = list.stream().filter(s->s.length()>3).collect(Collectors.toList());
        System.out.println(list1);
        List<String> list2 = list.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(list2);
        long count = list.stream().filter(s->s.length()>3).count();
        System.out.println("the number of string in the list which length more than 3 : " + count);

        //foreach method for stream that is differ from loop vali foreach method
        list.stream().forEach(x1 -> System.out.println(x1));

        //Stream.of() method
        Stream<Integer> s = Stream.of(9,99,999,9999,99999);
        s.forEach(x -> System.out.println(x));

        Double arr[] = {10.0,10.1,10.23,11.34};
        Stream<Double> s1 = Stream.of(arr);
        s1.forEach(y-> System.out.println(y));
    }
}
