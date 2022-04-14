package main;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.net.URI;

public class KeyHandler implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        switch (e.getKeyCode()) {

            case KeyEvent.VK_ESCAPE:
                Safety.sicherung();
                break;
            case KeyEvent.VK_BACK_SPACE:
                Main.alg.SZstart();
                break;
            case KeyEvent.VK_ENTER:
                Main.alg.start();
                break;
            case KeyEvent.VK_W:
                try {
                    Desktop.getDesktop().browse(URI.create("https://programmerlp-net.vercel.app"));
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                break;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }   
}
