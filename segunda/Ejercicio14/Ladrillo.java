package Ejercicio14;

import java.awt.*;


public class Ladrillo extends Bloque{
    
    //constructor
    public Ladrillo(int posx, int posy, int anchura, int altura, Color color){
        super(posx, posy, anchura, altura, color); //constructor de superclase bloque
    }
    
    public void dibujar(Graphics j){
        j.setColor(color);
        j.fillRect(x, y, width, height);
    }
}
