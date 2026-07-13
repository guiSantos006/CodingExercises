package santanderjavabootcamp.collectionseclassesuteis.classedate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    static void main() {
        var date = new Date(System.currentTimeMillis() - 999999999999L);
        DateFormat formater = new SimpleDateFormat();
        System.out.println(date);
        System.out.println(formater.format(date));


    }
}
