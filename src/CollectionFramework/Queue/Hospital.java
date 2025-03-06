package CollectionFramework.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Hospital {
    public static void main(String[] args) {
        Queue<String> patientQueue = new LinkedList<>();

        patientQueue.add("Alice");
        patientQueue.add("Bob");
        patientQueue.add("Charlie");
        patientQueue.add("Diana");

        System.out.println(" Patients in the queue:");
        showQueue(patientQueue);

        System.out.println("Check the first patient: " + patientQueue.poll());

        System.out.println("Next patient in line: " + patientQueue.peek());

        patientQueue.add("Ethan");
        System.out.println("Ethan joins the queue.");

        System.out.println("Updated Patient Queue:");
        showQueue(patientQueue);

        System.out.println("Total patients waiting: " + patientQueue.size());
    }

    // Helper method to display the queue
    public static void showQueue(Queue<String> queue) {
        if (queue.isEmpty()) {
            System.out.println("The queue is empty.");
        } else {
            for (String patient : queue) {
                System.out.println("- " + patient);
            }
        }
    }
}

