package Ejercicio16;

import java.awt.*;


public class Gun extends Rectangle{
    Color color;
    public static final int MOVX = 8; 
    
    //constructor
    public Gun(){
        super(130, 450, 10, 25);
        color = Color.red;
    }
    
    public void dibujar(Graphics j){
        j.setColor(color);
        j.fillRect(x, y, width, height);
    }
    
    /*public void actualizar(int direccion){
        if(direccion == Juego.DCHA && x < (300 - width))
            x += MOVX;
        else if (direccion == Juego.IZDA && (x > 0))
            x -= MOVX;
    }*/
    
    public void actualizar(int x){
        this.x = x;
    }
}
