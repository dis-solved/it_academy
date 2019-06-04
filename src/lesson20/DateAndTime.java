package lesson20;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateAndTime {
    public static void main(String[] args) {
        Date date = new Date();
        Instant i = date.toInstant(); // somehow conversion to new type


        // old class before java8 - very error prone

//        since java8 we should use package java.time.*
        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDate yesterday = LocalDate.of(2019,5,6);
        LocalDate tomorrow = LocalDate.of(2019,Month.MAY, 8);

        LocalTime _13_00 = LocalTime.of(13,0);
        System.out.println(_13_00);

        LocalDateTime today_13 = LocalDateTime.of(today,_13_00);
        System.out.println(today_13);

        LocalDate _2daysLater = today.plus(2, ChronoUnit.DAYS);
        System.out.println(_2daysLater);

        today.minusDays(2);
        System.out.println(today); //because all classes from java8 date and time are immutable

        ZonedDateTime zoned = ZonedDateTime.of(today_13, ZoneOffset.ofHours(1));
        ZonedDateTime now = ZonedDateTime.now(); // this will take the System default zone

        ZonedDateTime zonedDateTime = today
                .atTime(14, 14)
                .atZone(ZoneOffset.ofHours(2));
        System.out.println(zoned);

        Period period = Period.between(
                LocalDate.of(2016,1,5),
                LocalDate.now()
        );
        System.out.println(period);

        int days = period.getDays();
        System.out.println(days);

        Duration duration = Duration.of(40,ChronoUnit.MINUTES);

        ZonedDateTime zonedWith40Mins = zonedDateTime.plus(duration);
        System.out.println(zonedWith40Mins);
    }
}
