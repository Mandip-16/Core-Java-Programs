package CollectionFramework.Set;

import java.util.HashSet;
import java.util.Set;

public class EventAttendees {

    public static void main(String[] args) {
        Set<Attendee> attendees = new HashSet<>();

        attendees.add(new Attendee(101, "Alice"));
        attendees.add(new Attendee(102, "Bob"));
        attendees.add(new Attendee(103, "Charlie"));
        attendees.add(new Attendee(101, "Alice"));

        System.out.println("List of Attendees : ");
        showAttendees(attendees);

        System.out.println("Bob in a list or not : " + attendees.contains(new Attendee(102,"Bob")));

        System.out.println("Remove a charlie");
        attendees.remove(new Attendee(103, "Charlie"));
        System.out.println("Updated attendes : ");
        showAttendees(attendees);

        Set<Attendee> newattendees = new HashSet<>();
        newattendees.add(new Attendee(104, "Diana"));
        newattendees.add(new Attendee(105, "Ethan"));
        attendees.addAll(newattendees);
        System.out.println("New attendees are join : ");
        showAttendees(attendees);

        System.out.println("Total number of attendees is : " + attendees.size());

        System.out.println("Clear the list of attendees");
        attendees.clear();
        System.out.println("Attendees is empty or not: " + attendees.isEmpty());
    }

    public static void showAttendees(Set<Attendee> attendees) {
        if(attendees.isEmpty()) {
            System.out.println("The attendee list is empty");
        } else {
            for(Attendee attendee : attendees) {
                System.out.println("-"+" "+attendee);
            }
        }
    }
}
