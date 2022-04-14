package main;

import java.util.concurrent.ThreadLocalRandom;

public class auslosung {

    public static int superzahl, lottozahl1, lottozahl2, lottozahl3, lottozahl4, lottozahl5, lottozahl6;
    public static boolean stopmusic = false;
    public static int start = 3;

    public auslosung(){

        superzahl = ThreadLocalRandom.current().nextInt(1, 10);

        lottozahl1 = ThreadLocalRandom.current().nextInt(1, 50);
        lottozahl2 = ThreadLocalRandom.current().nextInt(1, 50);
        lottozahl3 = ThreadLocalRandom.current().nextInt(1, 50);
        lottozahl4 = ThreadLocalRandom.current().nextInt(1, 50);
        lottozahl5 = ThreadLocalRandom.current().nextInt(1, 50);
        lottozahl6 = ThreadLocalRandom.current().nextInt(1, 50);

    }

    public void start() {

        lottozahl1 = ThreadLocalRandom.current().nextInt(1, 50);
        lottozahl2 = ThreadLocalRandom.current().nextInt(1, 50);
        lottozahl3 = ThreadLocalRandom.current().nextInt(1, 50);
        lottozahl4 = ThreadLocalRandom.current().nextInt(1, 50);
        lottozahl5 = ThreadLocalRandom.current().nextInt(1, 50);
        lottozahl6 = ThreadLocalRandom.current().nextInt(1, 50);

        Safety.sicherung();
    }

    public void SZstart() {

        superzahl = ThreadLocalRandom.current().nextInt(1, 10);

    }

}
