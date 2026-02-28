package Date_And_Time_API;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAndTimeExample {
    public static void main(String[] args) {

        LocalDate ld = LocalDate.now();

        System.out.println("local date "+ld);

        LocalTime lt = LocalTime.now();
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Local Time "+lt);
        System.out.println("Local Date Time "+ldt);


    }
}
