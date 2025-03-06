package Java8.OptionalClassDemo;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String str = "Java is my coding language";
        Optional<String> optional = Optional.ofNullable(str);

        System.out.println(optional.isPresent());
        System.out.println(optional.get());

        System.out.println(optional.orElse("no value in this object"));
    }
}
