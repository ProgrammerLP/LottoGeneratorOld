package main;

import gui.Gui;

public class Main {

    public static auslosung alg = new auslosung();
    public static boolean start = true;

    public static void main(String[] args) {

        Gui gui = new Gui();
        clock c = new clock();

        gui.create();
        c.start();
        Musik.music("lottoaudio/lottomusic.wav");

    }

}
