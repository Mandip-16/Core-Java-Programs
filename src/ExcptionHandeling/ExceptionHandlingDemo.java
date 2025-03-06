package ExcptionHandeling;

import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ExceptionHandlingDemo {

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above to register.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // InputMismatchException
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            scanner.nextLine(); // Consume the leftover newline

            // ArrayIndexOutOfBoundsException
            int[] arr = {1, 2, 3};
            System.out.print("Enter array index (0-2): ");
            int index = scanner.nextInt();
            System.out.println("Array value: " + arr[index]);

            // ArithmeticException
            System.out.print("Enter divisor for division (numerator is 100): ");
            int divisor = scanner.nextInt();
            int result = 100 / divisor;
            System.out.println("Division result: " + result);

            // Throwing and catching custom exception
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            checkAge(age);
            System.out.println("Age verified. Registration successful!");

        } catch (InputMismatchException e) {
            System.out.println("Input error: Please enter a valid number.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array error: Index out of bounds.");
        } catch (ArithmeticException e) {
            System.out.println("Math error: Cannot divide by zero.");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Execution completed");
        }
    }
}

