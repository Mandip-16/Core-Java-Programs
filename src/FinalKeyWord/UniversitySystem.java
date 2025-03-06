package FinalKeyWord;

public class UniversitySystem {
    public static void main(String[] args) {
        University uni = new University("GTU123", "New York");
//        University uni2 = new University("GTU123", "New York");
//        University uni3 = new University("GTU123", "New York");
//        University uni4 = new University("GTU123", "New York");

        System.out.println(" University System ");
        uni.displayUniversityInfo();

        System.out.println("\nUpdating location...");
        uni.setLocation("California");

        System.out.println("\nUpdated University Info:");
        uni.displayUniversityInfo();

        // Trying to modify final variable generate error
        // uni.universityCode = "NEWCODE";

        System.out.println("\nUniversity Name : " + University.UNIVERSITY_NAME);

    }
}
