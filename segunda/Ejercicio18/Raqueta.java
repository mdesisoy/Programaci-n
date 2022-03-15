package Ejercicio18;

import java.awt.*;

public class Raqueta extends Rectangle{
    public static final int VELY = 9;
    Color color;
    
    //constructor
    public Raqueta(int x, int y){
        super(x, y, 10, 60);
        color = Color.white;
    }
    
    public void dibujar(Graphics j){
        j.setColor(color);
        j.fillRect(x, y, width, height);
    }
    
    public void update(int tecla, Raqueta raqueta1, Raqueta raqueta2, Event ev){
            if(tecla == Event.UP)
                raqueta2.y -= VELY;
            else if(tecla == Event.DOWN)
                raqueta2.y += VELY;
            else if(ev.key == 'w')
                raqueta1.y -= VELY;    
            else if(ev.key == 's')
                raqueta1.y += VELY;
    }
}
