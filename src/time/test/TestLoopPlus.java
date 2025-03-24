package time.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024,01,01);
        for(int i = 0; i < 5; i++){
            System.out.print("날짜 " + (i+1) + ": ");
            LocalDate date2 = date.plus(2 * i, ChronoUnit.WEEKS);
                                // = plusWeeks(2*i);
            System.out.println(date2);
        }
    }
}
