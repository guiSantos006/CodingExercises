package santanderjavabootcamp.collectionseclassesuteis.classesoffsetelocal;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Main {
    static void main() {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        localDateTime.toInstant(ZoneOffset.ofHours(-3));
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        OffsetDateTime offsetDateTimeUTC = offsetDateTime.withOffsetSameInstant(ZoneOffset.UTC);

        System.out.println(offsetDateTime.isEqual(offsetDateTimeUTC));



    }
}
