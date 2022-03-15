package Ejercicio15;

import java.awt.*;

public class Pajaro extends Rectangle{
    Color color;
    public static final int GRAVEDAD = 3;
    
    public Pajaro(){
        super(50, 60, 22, 22);
        color = Color.orange;
    }
    
    public void dibujar(Graphics j){
        j.setColor(color);
        j.fillOval(x, y, width, height);
    }
    
    public void actualizar(){
        y += GRAVEDAD;
    }
}
