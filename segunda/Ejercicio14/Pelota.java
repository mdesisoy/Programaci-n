package Ejercicio14;

import java.awt.*;
import java.util.List;

public class Pelota extends Bloque{
    int velX, velY;
    boolean fin = false;
    
    public Pelota(){
        super(140, 230, 17, 17, Color.pink);
        //velX = (int)(Math.random()* 5) + 1;
        //velY = (int)(Math.random()* 5) + 1;
        velX = -2;
        velY = -3;
    }
    
    public void dibujar(Graphics j){
        j.setColor(color);
        j.fillOval(x, y, width, height); //hereda de la clase Rectangle
        if(fin){
            j.drawString("GAME OVER", 120, 200);
        }
    }
    
    public void actualizar(Raqueta raqueta, List<Ladrillo> ladrillos){
        x += velX;
        y += velY;
        if((x < 0) || (x > (300-width))){
            velX = -velX;
        }
        if((y < 0) || (y > (300-height))){
            velY = -velY;
        }
        //CHOCA CON RAQUETA
        if(this.intersects(raqueta)){
            velY = -velY;
        }
        //CHOCA CON LADRILLO
        for (int i = 0; i < ladrillos.size(); i++) {
            if(this.intersects(ladrillos.get(i))){
                velY = -velY;
                ladrillos.remove(i);
                break;
            }
                
                /*if(this.x < ladrillos.get(i).x){
                    this.velX = -this.velX;
                    ladrillos.remove(i);
                }
                else if(this.x > (ladrillos.get(i).x + ladrillos.get(i).width)){
                    this.velX = -this.velX;
                    ladrillos.remove(i);
                }
                else if(this.y > (ladrillos.get(i).y + ladrillos.get(i).height)){
                    this.velY = -this.velY;
                    ladrillos.remove(i);
                }
                else if(this.y < ladrillos.get(i).y){
                    this.velY = -this.velY;
                    ladrillos.remove(i);
                }*/
            
                
        }
        if(this.y > (raqueta.y - raqueta.height)){
            this.setLocation(500, 500);
            velY = 0;
            velX = 0;
            fin = true;
        }
        
    }
}
