package Enum;

public enum Day {
    Sunday("Sunday","Somwar"),
    Monday("Monday","Somwar"),
    Tuesday("Tuesday","Somwar"),
    Wensday("Wensday","Somwar"),
    Thursday("Thursday","Somwar"),
    Friday("Friday","Somwar"),
    Saturday("Saturday","Somwar");

    Day(String lower,String hindi) {
        System.out.println("Our constructor is called");
        this.lower = lower;
        this.hindi = hindi;
    }



    private String lower;
    private String hindi;



    public String getHindi() {
        return hindi;
    }

    public String getLower() {
        return lower;
    }

    public String display() {
        return "Today is" + this.name();
    }
}
