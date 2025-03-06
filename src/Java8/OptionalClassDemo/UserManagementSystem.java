package Java8.OptionalClassDemo;

import java.util.Optional;

public class UserManagementSystem {

    public static void main(String[] args) {
        User user1 = new User("Mandeep","mandeep@1612.com");
        User user2 = new User("Deep",null);
        User user3 = null;

        System.out.println("user1 detail : ");
        displayUserDetail(Optional.ofNullable(user1));

        System.out.println("\nuser2 detail : ");
        displayUserDetail(Optional.ofNullable(user2));

        System.out.println("\nuser3 detail : ");
        displayUserDetail(Optional.ofNullable(user3));

    }

    public static void displayUserDetail(Optional<User> userOptional) {
        userOptional.ifPresentOrElse(
                user -> {
                    System.out.println("user name : " + user.getName());
                    String email = user.getEmail().orElse("Email not provided");
                    System.out.println("Email: " + email);
                },
                () -> System.out.println("User not found!")
        );
    }
}
