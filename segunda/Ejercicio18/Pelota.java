package Ejercicio18;

import java.awt.*;
import java.util.List;

public class Pelota extends Rectangle{
    int velX, velY;
    Color color;
    
    public Pelota(){
        super(190, 100, 17, 17);
        color = Color.red;
        velX = (int)(Math.random()* 4) + 2;
        velY = (int)(Math.random()* 4) + 2;
    }
    
    public void dibujar(Graphics j){
        j.setColor(color);
        j.fillOval(x, y, width, height);
    }
    
    public void actualizar(Raqueta raqueta1, Raqueta raqueta2){
        x += velX;
        y += velY;
        if((x < 0) || (x > (500-width))){
            velX = -velX;
        }
        if((y < 0) || (y > (300-height))){
            velY = -velY;
        }
        
        //CHOCA CON RAQUETA
        if(this.intersects(raqueta1) || this.intersects(raqueta2)){
            velX = -velX;
        }
    }
}
