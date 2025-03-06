package Java8.LearnFunctionalInterfaceDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LearnPredicate {

    public static void main(String[] args) {
        Predicate<Integer> salarycheck = x -> x > 100000;
        System.out.println(salarycheck.test(10000000));

        Predicate<Integer> isEven = x -> x%2 ==0 ;
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);

        //print even number using stream
        list.stream().filter(isEven).forEach(System.out::println);

//        //using traditional approach
//        for(int i:list) {
//            if(isEven.test(i)) {
//                System.out.println(i);
//            }
//        }

        Predicate<String> startLetter = x -> x.toLowerCase().charAt(0) == 'm';
        Predicate<String> endLetter = x -> x.toLowerCase().charAt(x.length()-1) == 'p';

        //and method (both condition are true than return true)
        Predicate<String> andMethod = startLetter.and(endLetter);

        //or method (only one condition is true then return true)
        Predicate<String> orMethod = startLetter.or(endLetter);

        System.out.println(orMethod.test("DEEP"));//true
        System.out.println(andMethod.test("DEEP"));//false
        System.out.println(andMethod.test("MANDEEP"));

        //negate() method - it is give opposite output of condition like the name negate(negligate karvu)
        System.out.println(andMethod.negate().test("DEEP"));
        System.out.println(andMethod.negate().test("MANDEEP"));
    }
}
