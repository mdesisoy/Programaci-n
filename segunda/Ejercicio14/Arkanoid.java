package Ejercicio14;

import java.applet.Applet;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

public class Arkanoid extends Applet implements Runnable{
    public static final int FILAS = 5;
    public static final int COLS = 10;
    public static final int IZDA = 0;
    public static final int DCHA = 1;
    Thread animacion; //para que la pleota se mueva sola
    Image imagen;
    Graphics noseve;
    //comentado los hechos con array
    //Ladrillo ladrillos[][];
    List<Ladrillo> ladrillos;
    Raqueta raqueta;
    Pelota pelota;
    
    //INIT
    public void init(){
        imagen = this.createImage(300,300);
        noseve = imagen.getGraphics();
        /*ladrillos = new Ladrillo[FILAS][COLS];    
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLS; j++) {
                ladrillos[i][j] = new Ladrillo((30*j)+1, (12*i)+1, 28, 10, Bloque.COLORES[i]);
                //el +1 es para que no pegue en el borde
            }
        }*/
        ladrillos = new ArrayList<Ladrillo>();
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLS; j++) {
                ladrillos.add(new Ladrillo((30*j)+1, (12*i)+1, 28, 10, Bloque.COLORES[i]));
                //el +1 es para que no pegue en el borde
            }
        }
        raqueta = new Raqueta();
        pelota = new Pelota();
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
        noseve.setColor(Color.black);
        noseve.fillRect(0, 0, 300, 300);
        /*for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLS; j++) {
                ladrillos[i][j].dibujar(noseve);
            }
        }*/
        for (int i = 0; i < ladrillos.size(); i++) {
            ladrillos.get(i).dibujar(noseve); 
            //no se puede hacer con bucles anidados porque al borrar de la 
            //lista, seguiría recorriendo el mismo num de elementos en vez de menos
        }
        raqueta.dibujar(noseve);
        pelota.dibujar(noseve);
        g.drawImage(imagen, 0, 0, this);
    }
    
    //RUN
    public void run(){
        do{
            pelota.actualizar(raqueta,ladrillos);
            repaint();
            try{
                Thread.sleep(35);
            }catch(InterruptedException e){}
        }while(true);
    }

 
    
    public boolean keyDown(Event ev, int tecla){
        //para moverlo con las teclas, los codigos son 1006 y 1007
        if(tecla == 1006)
            raqueta.update(IZDA);
        else if(tecla == 1007)
            raqueta.update(DCHA);
            
        return true;
    }
}

