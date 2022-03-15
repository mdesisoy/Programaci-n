package Ejercicio16;

import java.awt.*;

public class Bala extends Rectangle{
    Color color;
    public static final int MOVY = 10;
    
    //constructor
    public Bala(int x){
        super(x, 440, 5, 10);
        color = Color.gray;
    }
    
    public void dibujar(Graphics j){
        j.setColor(color);
        j.fillRect(x, y, width, height);
    }
    
    public void actualizar(){
        y -= MOVY;
    }
}
