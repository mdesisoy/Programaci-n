package Ejercicio18;

import java.applet.Applet;
import java.awt.*;

public class Pong extends Applet implements Runnable{
    public static final int TIEMPO = 20;
    Thread animacion; 
    Image imagen;
    Graphics noseve;
    Raqueta raqueta1;
    Raqueta raqueta2;
    Pelota pelota;
    int puntosJugador1;
    int puntosJugador2;
    boolean fin = false;
    
    //INIT
    public void init(){
        imagen = this.createImage(500,300);
        this.resize(500,300);
        noseve = imagen.getGraphics();
        
        raqueta1 = new Raqueta(50, 125);
        raqueta2 = new Raqueta(450, 125);
        
        pelota = new Pelota();
        
        puntosJugador1 = 0;
        puntosJugador2 = 0;
    }
    
    //START
    public void start(){
        animacion = new Thread(this);
        animacion.start(); //llama a run
    }
    
    public void update(Graphics g){ //lo llama el metodo repaint
        paint(g); //para no borrar
    }
    
    //PAINT
    public void paint(Graphics g){
        //fondo juego
        noseve.setColor(Color.pink);
        noseve.fillRect(0, 0, 500, 300);
        noseve.setColor(Color.black);
        noseve.fillRect(250, 0, 5, 300);
        noseve.drawOval(400, 10, 280, 280);
        noseve.drawOval(-180, 10, 280, 280);
        
        raqueta1.dibujar(noseve);
        raqueta2.dibujar(noseve);
        
        //puntuacion
        noseve.setColor(Color.pink);
        noseve.fillRect(228, 8, 100, 30);
        noseve.setColor(Color.gray);
        noseve.setFont(new Font("Arial", Font.BOLD, 25));
        noseve.drawString(puntosJugador1 + " : " + puntosJugador2, 228, 30);
        
        if(fin)
            if(puntosJugador1 == 3){
                noseve.setColor(Color.yellow);
                noseve.setFont(new Font("Arial", Font.BOLD, 25));
                noseve.drawString("HAS GANADO JUGADOR1!!", 100, 80);
                animacion.stop();
            }
            else if(puntosJugador2 == 3){
                noseve.setColor(Color.yellow);
                noseve.setFont(new Font("Arial", Font.BOLD, 25));
                noseve.drawString("HAS GANADO JUGADOR2!!", 100, 80);
                animacion.stop();
            }
        
        pelota.dibujar(noseve);
        g.drawImage(imagen, 0, 0, this);
    }
    
    //RUN
    public void run(){
        do{
            pelota.actualizar(raqueta1, raqueta2);
            
            //Puntuacion
            if(pelota.x > raqueta2.x + (raqueta2.width + 10)){
                puntosJugador1 += 1;
                pelota.x = 190;
                pelota.y = 100;
                pelota.velX = pelota.velX;
                /*pelota.x = raqueta1.x + raqueta1.width - 10;
                pelota.y = raqueta1.y;*/
            }
            else if(pelota.x < (raqueta1.x - 10)){
                puntosJugador2 += 1;
                /*pelota.x = raqueta2.x - raqueta2.width - 10;
                pelota.y = raqueta2.y;*/
                pelota.x = 190;
                pelota.y = 100;
                pelota.velX = -pelota.velX;
            }   
            
            if(puntosJugador1 == 3 || puntosJugador2 == 3)
                fin = true;
            
            repaint();
            try{
                Thread.sleep(TIEMPO);
            }catch(InterruptedException e){}
        }while(true);
    }
    
    public boolean keyDown(Event ev, int tecla){
        raqueta2.update(tecla, raqueta1, raqueta2, ev);
        raqueta1.update(tecla, raqueta1, raqueta2, ev);
        return true;
    }
    //en el de agustin pones aqui la tecla y en el update mandas arriba o abajo
    //el dato que mandas en la clase raqueta hara subir o bajar la y
}
