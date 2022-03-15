package Ejercicio2;

import java.awt.*;

public class Gota extends Rectangle{
    Color color;
    int vely;
    
    //constructor
    public Gota(){
        super((int)(Math.random()* 250), 0, 10, 30);
        color = Color.blue;
        vely = (int)(Math.random()* 2) + 1;
        //velx = (int)(Math.random()* 8) - 4; //de -4 a 4
    }
    
    public void dibujar(Graphics j){
        j.setColor(color);
        j.fillOval(x, y, width, height);
    }
    
    public void actualizar(){
        //x += velx;
        y += vely;
    }
}
