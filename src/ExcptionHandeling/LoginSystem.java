package ExcptionHandeling;

import java.util.Scanner;

class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}

public class LoginSystem {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "password123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter username: ");
            String inputUsername = scanner.nextLine();

            System.out.print("Enter password: ");
            String inputPassword = scanner.nextLine();

            if (!inputUsername.equals(USERNAME) || !inputPassword.equals(PASSWORD)) {
                throw new InvalidCredentialsException("Invalid username or password.");
            }

            System.out.println("Login successful! Welcome, " + inputUsername + ".");

        } catch (InvalidCredentialsException e) {
            System.out.println("Login failed: " + e.getMessage());
        }
    }
}

