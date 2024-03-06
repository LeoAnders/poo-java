package DateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        //https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        //Instancia na hora atual
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        //Text ISO 8601  Date-time
        LocalDate d04 = LocalDate.parse("2024-03-05");
        LocalDateTime d05 = LocalDateTime.parse("2024-03-05T01:30:26");
        Instant d06 = Instant.parse("2024-03-05T01:30:26Z");
        Instant d07 = Instant.parse("2024-03-05T01:30:26-03:00");

        //Text in custom format
        LocalDate d08 = LocalDate.parse("03/05/2024",fmt1);
        LocalDateTime d09 = LocalDateTime.parse("03/05/2024 01:30", fmt2);

        //Isolated data
        LocalDate d10 = LocalDate.of(2024,3,5);
        LocalDateTime d11 = LocalDateTime.of(2024,3,5,1,30);

        System.out.println("d01->" + d01.toString());
        System.out.println("d02->" + d02.toString());
        System.out.println("d03->" + d03.toString());
        System.out.println("d04->" + d04.toString());
        System.out.println("d05->" + d05.toString());
        System.out.println("d06->" + d06.toString());
        System.out.println("d07->" + d07.toString());
        System.out.println("d08->" + d08.toString());
        System.out.println("d09->" + d09.toString());
        System.out.println("d010->" + d10.toString());
        System.out.println("d011->" + d11.toString());
    }
}
