package Game;

import javax.swing.*;
import java.awt.*;

public class SerpientePanel extends JPanel {
    private SerpienteBloque[]gus;
    private int numbloques;

    public SerpientePanel(SerpienteBloque[] gus, int numbloques) {
        this.gus = gus;
        this.numbloques = numbloques;
    }

    public int getNumbloques() {
        return numbloques;
    }

    public void setNumbloques(int numbloques) {
        this.numbloques = numbloques;
    }

    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        for(int i=0;i<numbloques;i++)
            gus[i].trazar(g);
    }

}
