package FinalKeyWord;

class University {
    public static final String UNIVERSITY_NAME = "Global Tech University";

    private final String universityCode;
    private String location;

    // Final Block (Instance Initialization Block) - Runs before the constructor every time an object is created.
    {
        System.out.println("Initializing university...");
    }

    public University(String universityCode, String location) {
        this.universityCode = universityCode;  // Final variable must be initialized either here or in a block
        this.location = location;
    }

    public final void displayUniversityInfo() {
        System.out.println("University: " + UNIVERSITY_NAME);
        System.out.println("Code: " + universityCode);
        System.out.println("Location: " + location);
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUniversityCode() {
        return universityCode;
    }
}