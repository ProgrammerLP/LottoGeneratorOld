package gui;

import main.KeyHandler;

import javax.swing.*;

public class Gui {

    JFrame jf;
    Draw d;

    public static int width = 500, height = 300;
    public static int xofflz = 90, yofflz = 100;
    public static int xoffsz = 218, yoffsz = 180;

    public void create() {

        jf = new JFrame("Automatische Lottozahlen - Lotto 6 aus 49 v1.0.2");
        jf.setSize(width,height);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setLayout(null);
        jf.setResizable(false);
        jf.addKeyListener(new KeyHandler());

        d = new Draw();
        d.setBounds(0,0,width,height);
        d.setVisible(true);
        jf.add(d);

        jf.requestFocus();
        jf.setVisible(true);
    }

}
