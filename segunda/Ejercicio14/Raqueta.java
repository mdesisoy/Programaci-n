package Ejercicio14;

import java.awt.*;

public class Raqueta extends Bloque{
    public static final int VELX = 7;
    
    //constructor
    public Raqueta(){
        super(125, 250, 50, 10, Color.white); //constructor de superclase bloque
    }
    
    public void dibujar(Graphics j){
        j.setColor(color);
        j.fillRect(x, y, width, height);
    }
    
    public void update(int direccion){
        if(direccion == Arkanoid.DCHA && x < (300 - width))
            x += VELX;
        else if (direccion == Arkanoid.IZDA && (x > 0))
            x -= VELX;
        
        //forma agustin para no salirse
        //if(x <= 0) x = 0
        //if(x >= 240) x = 240
    }
}
