package Ejercicio13;

import java.awt.*;

public class Pelota extends Rectangle{
    Color colores[] = {Color.cyan, Color.green, Color.magenta, Color.yellow,
                    Color.pink, Color.red, Color.orange};
    Color color;
    int velX, velY;
    
    public Pelota(){
        //PASAR VALORES RANDOM teniendo una superclase
        //subclase de rectangulo
        super((int)(Math.random()*250), (int)(Math.random()*250), 0, 0); 
        int diametro = (int)(Math.random()*25) + 10;
        width = height = diametro;
        color = colores[(int)(Math.random()*colores.length)];
        velX = (int)(Math.random()* 5) + 1;
        velY = (int)(Math.random()* 5) + 1;
    }
    
    public void dibujar(Graphics j){
        j.setColor(color);
        j.fillOval(x, y, width, height); //hereda de la clase Rectangle
    }
    
    public void actualizar(){
        x += velX;
        y += velY;
        if((x < 0) || (x > (300-width))){
            velX = -velX;
            //añadido por mi
            color = colores[(int)(Math.random()*colores.length)];
        }
        if((y < 0) || (y > (300-height))){
            velY = -velY;
            //añadido por mi
            color = colores[(int)(Math.random()*colores.length)];
        }
        
    }
}
