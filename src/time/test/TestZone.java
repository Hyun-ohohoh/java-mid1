package time.test;

import java.time.*;

public class TestZone {

    public static void main(String[] args) {

        ZonedDateTime seoul = ZonedDateTime.of(LocalDate.of(2024,01,01), LocalTime.of(9,0),
                ZoneId.of("Asia/Seoul"));
        ZonedDateTime london = seoul.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime newyork = seoul.withZoneSameInstant(ZoneId.of("America/New_York"));



        System.out.println("seoul = " + seoul);
        System.out.println("london = " + london);
        System.out.println("newyork = " + newyork);

        

    }
}
