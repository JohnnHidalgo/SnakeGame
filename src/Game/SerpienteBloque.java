package Game;

import java.awt.*;

public class SerpienteBloque extends Rectangulo{


    public static final int TAN = 10;

    public SerpienteBloque(int x, int y) {
        super(x, y, TAN, TAN,TAN, 0, Color.RED);
    }


	/*
	public SerpienteBloque(int x, int y, int ancho, int alto, int incx, int incy, Color color) {
		super(x, y, ancho, alto, incx, incy, color);
	}*/

    public void mover(int maxX, int maxY) {
        if(getIncx()!=0)
            if(getX()<0)
                setX(maxX-TAN);
            else
            if(getX()>maxX-TAN)
                setX(0);
            else
                setX(getX()+getIncx());

        if(getIncy()!=0)
            if(getY()<0)
                setY(maxY-TAN);
            else
            if(getY()>maxY-TAN)
                setY(0);
            else
                setY(getY()+getIncy());

    }

}
