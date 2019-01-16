package Game;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SerpienteFrame extends JFrame implements KeyListener {
    SerpienteBloque b;

    public SerpienteFrame(SerpienteBloque gus){
        b = gus;
        addKeyListener(this);
    }

    @Override
    public void keyPressed(KeyEvent event) {

        System.out.println(event.getKeyCode());

        switch (event.getKeyCode()) {
            case 37:
                if(b.getIncx()==0) {
                    b.setIncx(-SerpienteBloque.TAN);
                    b.setIncy(0);
                }
                break;
            case 38:
                if(b.getIncy()==0) {
                    b.setIncy(-SerpienteBloque.TAN);
                    b.setIncx(0);
                }
                break;
            case 39:
                if(b.getIncx()==0) {
                    b.setIncx(SerpienteBloque.TAN);
                    b.setIncy(0);
                }
                break;
            case 40:
                if(b.getIncy()==0) {
                    b.setIncy(SerpienteBloque.TAN);
                    b.setIncx(0);
                }
                break;
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
    }
    @Override
    public void keyTyped(KeyEvent e) {
    }
}
