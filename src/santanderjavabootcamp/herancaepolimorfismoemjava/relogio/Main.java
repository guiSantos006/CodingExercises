package santanderjavabootcamp.herancaepolimorfismoemjava.relogio;

public class Main {
    static void main() {
        Clock brlClock = new BRLClock();
        brlClock.setSecond(0);
        brlClock.setMinute(0);
        brlClock.setHour(20);

        System.out.println(brlClock.getTime());

        System.out.println(new USClock().convert(brlClock).getTime());

    }
}
