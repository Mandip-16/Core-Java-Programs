package DateAndTime;

import java.time.*;

public class DateAndTime {

    public static void main(String[] args) {
        printCurrentDateAndTime();
    
        LocalDateTime dt = LocalDateTime.of(2025,Month.FEBRUARY/* or 02 pan lakhay*/,21,11,16);
        System.out.println(dt);
        System.out.println("After 6 months:" + dt.plusMonths(6));
        System.out.println("Before 6 months:" + dt.minusMonths(6));
    }
    
    public static void printCurrentDateAndTime() {
        LocalDate date = LocalDate.now();
        System.out.println(date);
    
        LocalTime time = LocalTime.now();
        System.out.println(time);
    
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
    
        int dd = dateTime.getDayOfMonth();
        int mm = dateTime.getMonthValue();
        int yy = dateTime.getYear();
    
        System.out.println(dd + "/" + mm + "/" + yy);
        System.out.printf("%d-%d-%d", dd, mm, yy);
    
        LocalTime localtime = LocalTime.now();
        int hour = localtime.getHour();
        int min = localtime.getMinute();
        int sec = localtime.getSecond();
        int nano = localtime.getNano();
    
        System.out.println(hour + ":" + min + ":" + sec + ":" + nano);
        System.out.printf("%d:%d:%d:%d", hour, min, sec, nano);
    
        System.out.println();
    }
}
