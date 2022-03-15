package Ejercicio16;

import java.awt.*;

public class Nave extends Rectangle{
    Color color;
    int vely;
    int velx;
    
    //constructor
    public Nave(){
        super((int)(Math.random()* 250), (int)(Math.random()* 100), 30, 10);
        color = Color.white;
        vely = (int)(Math.random()* 2) + 1;
        velx = (int)(Math.random()* 8) - 4; //de -4 a 4
    }
    
    public void dibujar(Graphics j){
        j.setColor(color);
        j.fillRect(x, y, width, height);
    }
    
    public void actualizar(){
        x += velx;
        y += vely;
        if ((x >= 300 - width) || (x <= 0))
            velx = -velx;
    }
}
