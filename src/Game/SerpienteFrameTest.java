package Game;

import javax.swing.*;
import java.awt.*;

public class SerpienteFrameTest {

    public static final int TANGUS =100;
    public static void main (String []args) {
        String nombre = JOptionPane.showInputDialog(null,"Nombre:","Juego Serpiente", JOptionPane.QUESTION_MESSAGE);
        nombre = (nombre ==null)? "anonimo":nombre;
        JLabel mensaje =new JLabel(String.format("Nombre: %s\t		Puntos:",nombre));
        SerpienteBloque []gus = new SerpienteBloque[TANGUS];

        for(int i=0;i<gus.length;i++)
            gus[i]=new SerpienteBloque(200-i*SerpienteBloque.TAN,TANGUS);

        int numbloques=5;

        SerpientePanel panel = new SerpientePanel(gus, numbloques);
        SerpienteFrame ventana =new SerpienteFrame(gus[0]);
        ventana.setLayout(new BorderLayout());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.add(panel,BorderLayout.CENTER);
        ventana.add(mensaje,BorderLayout.SOUTH);
        ventana.setSize(500,220);
        ventana.setVisible(true);

        Boolean salir =false;
        int ciclos=1;

        while(!salir) {
            if(ciclos %50==0 && numbloques<TANGUS) {
                ciclos =0;
                numbloques++;
                panel.setNumbloques(numbloques);
            }
            ciclos++;
            System.out.println("numBloques"+numbloques);
            for(int i =numbloques;i>0;i-- ) {
                gus[i].setX(gus[i-1].getX());
                gus[i].setY(gus[i-1].getY());
            }
            gus[0].mover(panel.getWidth(), panel.getHeight());

            for (int j=1;j<gus.length;j++) {
                if(gus[0].colision(gus[j])){
                    //salir=true;
                }

            }



            panel.repaint();
            try {
                Thread.sleep(150);
            }catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }//fin  catch
        }//fin while

    }//fin main

}//fin class
