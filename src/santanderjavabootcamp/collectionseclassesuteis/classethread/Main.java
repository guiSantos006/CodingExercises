package santanderjavabootcamp.collectionseclassesuteis.classethread;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class Main {

    private final static Queue<Integer> numbers = new LinkedBlockingQueue<>(250_000);

    private synchronized static void inc(int number){
            numbers.add(number);
    }

    private synchronized static void show() {
            System.out.println(numbers);
    }

    public static void main(String[] args) {

        Runnable inc = () -> {
            for (int i = 0; i < 100_000; i++) {
                inc(i);

            }

        };

        Runnable dec = () -> {
            for (int i = 0; i > -100_000; i--) {
                inc(i);
            }
        };

        Runnable show = () -> {
            for (int i = 0; i < 250_000; i++) {
                show();
            }
        };


        var execInc = new Thread(inc);
        execInc.start();
        execInc.setName("Inc");
        var execDec = new Thread(dec);
        execDec.start();
        execDec.setName("Dec");
        var execShow = new Thread(show);
        execShow.start();
        execShow.setName("Show");

        System.out.println(execInc.getName());
        System.out.println(execDec.getName());
        System.out.println(execShow.getName());


    }
}
