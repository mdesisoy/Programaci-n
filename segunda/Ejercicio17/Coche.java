package Ejercicio17;

import java.awt.*;

public class Coche extends Rectangle{
    Color colores[] = {Color.red, Color.blue, Color.yellow, Color.pink};
    Color color;
    private int vely;
    private int velx;
    
    public int getVely() {
        return vely;
    }

    public void setVely(int vely) {
        this.vely = vely;
    }

    public int getVelx() {
        return velx;
    }

    public void setVelx(int velx) {
        this.velx = velx;
    }
    
    public Coche(int x, int y){
        super(x, y, (int)(Math.random()* 40) + 10, 20);
        color = colores[(int)(Math.random() * colores.length)];
        /*super(0, 0, 30, 20)
        if(Math.random() >= .5)
            velx = (int)(Math.random()* 4) + 2;
        else
            velx = -(int)(Math.random()* 4) + 2;
        x = ((velx>0)?-30):500; 
        y = (velx>0)?(int)(Math.random()* 78) + 152: (int)(Math.random()* 78) + 50;
        color = colores[(int)(Math.random() * colores.length)];*/
        velx = (int)(Math.random()* 4) + 2; //mio con *1 + 4
        vely = (int)(Math.random()* 5) - 2; //*5 significa entre 0 y 4 -> con el -2 va de -2 a 2
        //si uso vel de agustin sale cad acoche a vel distinta pero se superponen
    }
    
    public void dibujar(Graphics j){
        j.setColor(color);
        j.fillRect(x, y, width, height);
    }
    
    public void actualizar(int direccion){
        if(direccion == Juego.IZDA){
            x -= velx;
            y += vely;
        }
        else{
            x += velx;
            y += vely;
        }
        
        //en la de agustin seria poner solo x += velx
    }
}

