package santanderjavabootcamp.collectionseclassesuteis.aulas.classesstringbuilderebuffer;

import java.time.Duration;
import java.time.OffsetDateTime;

public class Main {
    static void main() {

        var stringStart = OffsetDateTime.now();
        String stringConcat = "value";
        stringConcat += "2";
        for (int i = 0; i < 400_000; i++) {
            stringConcat += i;
        }
        var stringEnd = OffsetDateTime.now();
        System.out.printf("String : %s \n", getInterval(stringStart, stringEnd));

        var stringBuilderStart = OffsetDateTime.now();
        StringBuilder builderConcat = new StringBuilder();
        for (int i = 0; i < 400_000; i++) {
            builderConcat.append(i);
        }
        var stringBuilderEnd = OffsetDateTime.now();
        System.out.printf("StringBuilder (singlethread) : %s \n", getInterval(stringBuilderStart, stringBuilderEnd));

        var stringBufferStart = OffsetDateTime.now();
        StringBuffer bufferConcat = new StringBuffer();
        for (int i = 0; i < 400_000; i++) {
            bufferConcat.append(i);
        }
        var stringBufferEnd = OffsetDateTime.now();
        System.out.printf("StringBuffer (multithread) : %s \n", getInterval(stringBufferStart, stringBufferEnd));
    }

    private static long getInterval(OffsetDateTime stringStart, OffsetDateTime stringEnd) {
        return Duration.between(stringStart, stringEnd).toMillis();
    }

}
