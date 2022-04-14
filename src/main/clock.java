package main;

public class clock extends Thread {

    public static boolean running = true;
    public static long time = 100;


    public void run() {
        while (running) {
            try {
                sleep(time);
                Safety.sicherung();

                if (Main.start) {
                    auslosung.start -= 1;
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(":-(");
            }


        }
    }
}