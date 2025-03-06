package Java8.OptionalClassDemo.OptionalExample;

import java.util.Optional;

public class Demo {

    public static void main(String[] args) {
        User user1 = new User("mandeep", new Address("Unjha"));
        User user2 = new User("man", null);

        System.out.println(getCity(Optional.ofNullable(user1)));
        System.out.println(getCity(Optional.ofNullable(user2)));
    }

    public static String getCity(Optional<User> userOptional) {
        return userOptional.flatMap(User::getAddress).map(Address::getCity).orElse("City not found");
    }
}
