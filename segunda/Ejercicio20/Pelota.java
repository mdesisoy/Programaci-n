package Ejercicio20;

import java.awt.*;

public class Pelota extends Rectangle{
    Color colores[] = {Color.orange, Color.yellow, Color.red, Color. pink, Color.white};
    Color color;
    int velx;
    int vely;
    
    //constructor
    public Pelota(int dim, int x, int y){
        super(x, y, dim, dim);
        color = colores[(int)(Math.random()* 5)];
        velx = (int)(Math.random()* 4) + 2;
        vely = (int)(Math.random()* 4) + 2;
    }
    
    public void dibujar (Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, width, height);
    }
     
    public void actualizar() {
        x += velx;
        y += vely;
        if((x < 0) || (x > (500-width))){
            velx = -velx;
        }
        if((y < 0) || (y > (300-height))){
            vely = -vely;
        }
    }
}
