package cz.spsmb.otazka13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd.MM.YYYY hh:mm:ss");
        DateTimeFormatter pattern2 = DateTimeFormatter.ofPattern("MM//MMMM - EEEE - YYYY");
        System.out.println(now.format(pattern));

        LocalDate start = LocalDate.of(2023, Month.JANUARY, 1);
        Long between = ChronoUnit.DAYS.between(start, now.toLocalDate());
        System.out.println(between);

        LocalDate start2 = LocalDate.of(1991, Month.SEPTEMBER, 17);
        LocalDate brthd = LocalDate.of(2006, Month.MARCH, 7);
        Long between2 = ChronoUnit.DAYS.between(start2, brthd);
        System.out.println(between2);

        System.out.println(now.format(pattern2));
    }
}
