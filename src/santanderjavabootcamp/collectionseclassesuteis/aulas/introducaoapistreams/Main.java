package santanderjavabootcamp.collectionseclassesuteis.aulas.introducaoapistreams;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static void main() {
        /*
        var value1 = Stream.generate(() -> new Random().nextInt())
                .limit(5)
                .toArray(Integer[]::new);

        for (var v : value1){
            System.out.println(v);
        }

        System.out.println("===================");

        var value2 = IntStream.generate(() -> new Random().nextInt())
                .limit(5)
                .toArray();

        for (var v : value2){
            System.out.println(v);
        }

         */

        List<Integer> values1 = List.of(3,5,6,12);
        List<Integer> values2 = List.of(1,2,3,4,5,6,7,8,9,10,11,12);

        var newValues = values2.stream()
                .parallel()
                .filter(values1::contains)
                .peek(n -> System.out.printf("Filter %s \n", n))
                .map(n -> values1.stream().reduce(n , (n1,n2) -> n1 - n2))
                .peek(n -> System.out.printf("Map %s \n", n))
                .collect(Collectors.toSet());

        System.out.println(newValues);
    }
}
