package Ejercicio19;

import java.awt.*;

public class Obstaculos extends Rectangle{
    Color color;
    public static final int MOV_X = 5;
    
    public Obstaculos(){
        super(500, 215, 15, 15);
        color = Color.BLACK;
    }
    
     public void dibujar (Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
     
     public void actualizar() {
        x -= MOV_X;
    }
}
