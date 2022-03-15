package Ejercicio15;

import java.awt.*;

public class Columna{
    private Rectangle arriba, abajo;
    public static final int HUECO = 68;
    public static final int ANCHURA = 30;
    public static final int MOV_X = 3;
    
    //getters y setters
     public Rectangle getArriba() {
        return arriba;
    }

    public void setArriba(Rectangle arriba) {
        this.arriba = arriba;
    }

    public Rectangle getAbajo() {
        return abajo;
    }

    public void setAbajo(Rectangle abajo) {
        this.abajo = abajo;
    }
    
    //constructor
    public Columna () {
        int altura = (int)(Math.random()*150)+ 50;
        arriba = new Rectangle(280,0,ANCHURA,altura);
        abajo = new Rectangle(280,altura+HUECO,ANCHURA,300-HUECO-altura);
    }
    
    public void actualizar() {
        arriba.x -= MOV_X;
        abajo.x -= MOV_X;
    }
    
    public void dibujar (Graphics g) {
        g.setColor(Color.pink);
        g.fillRect(arriba.x, arriba.y, arriba.width, arriba.height);
        g.fillRect(abajo.x, abajo.y, abajo.width, abajo.height);
    }
}
