package gui;

import main.Main;
import main.auslosung;
import main.clock;

import javax.swing.*;
import java.awt.*;

public class Draw extends JLabel {

    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);

        if (Main.start) {
            clock.time = 1000;

            //Draw Background
            g.setColor(Color.DARK_GRAY);
            g.fillRect(0, 0, Gui.width, Gui.height);

            //Draw Scores
            g.setColor(Color.WHITE);
            g.setFont(new Font("Arial", Font.BOLD, 40));
            g.drawString("Lotto Zahlen 6 aus 49", 50, 100);
            g.setFont(new Font("Arial", Font.BOLD, 25));
            g.drawString("by ProgrammerLP",130, 150);
            g.drawString(""+auslosung.start, 240, 200);

            if (auslosung.start <= 0) {
                Main.start = false;
                clock.time = 100;
            }
        }

        if (!Main.start) {
            //Draw Background
            g.setColor(new Color(226, 176, 7));
            g.fillRect(0, 0, Gui.width, Gui.height);

            //Draw Grid
            g.setColor(Color.BLACK);
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 1; j++) {
                    g.drawRect(i * 50 + Gui.xofflz, j * 50 + Gui.yofflz, 50, 50);
                }
            }

            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < 1; j++) {
                    g.drawRect(i * 50 + Gui.xoffsz, j * 50 + Gui.yoffsz, 50, 50);
                }
            }

            //Draw Strings
            g.setColor(Color.CYAN);
            g.setFont(new Font("ARIAL", Font.BOLD, 25));
            g.drawString("Press Enter for new Numbers.", 70, 50);
            g.drawString("Press Backspace for a new Superzahl", 20, 75);
            g.setFont(new Font("ARIAL", Font.BOLD, 16));
            g.setColor(Color.BLACK);
            g.drawString("Press 'W' to visit my Website", 5, 260);

            //Lotto Zahlen
            g.setColor(Color.BLACK);
            g.setFont(new Font("ARIAL", Font.BOLD, 25));
            g.drawString("" + auslosung.lottozahl1, 103, 135);
            g.drawString("" + auslosung.lottozahl2, 153, 135);
            g.drawString("" + auslosung.lottozahl3, 203, 135);
            g.drawString("" + auslosung.lottozahl4, 253, 135);
            g.drawString("" + auslosung.lottozahl5, 303, 135);
            g.drawString("" + auslosung.lottozahl6, 353, 135);

            //Superzahl
            g.drawString("" + auslosung.superzahl, 237, 215);
            g.setFont(new Font("Arial", Font.BOLD, 20));
            g.setColor(Color.DARK_GRAY);
            g.drawString("Superzahl", 110, 213);

        }
        repaint();
    }


}
