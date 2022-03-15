package Ejercicio19;

import java.awt.*;

public class Dinosaurio extends Rectangle{
    Color color;
    public static final int GRAVEDAD = 4;
    
    public Dinosaurio(){
        super(50, 190, 22, 40);
        color = Color.green;
    }
    
    public void dibujar(Graphics j){
        j.setColor(color);
        j.fillRect(x, y, width, height);
    }
    
    public void actualizar(){
        if(y < (230 - height))
            y += GRAVEDAD;
    }
}
