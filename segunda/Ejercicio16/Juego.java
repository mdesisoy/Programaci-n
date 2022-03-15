package Ejercicio16;

import java.applet.Applet;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

public class Juego extends Applet implements Runnable{
    public static final int TIEMPO = 30;
    public static final int IZDA = 0;
    public static final int DCHA = 1;
    Thread animacion; 
    Image imagen;
    Graphics noseve;
    Gun gun;
    List<Nave> naves;
    List<Bala> balas;
    int intervalo;
    int puntuacion = 0;
    boolean fin = false;
    boolean loser = false;
    
    //INIT
    public void init(){
        imagen = this.createImage(300,500);
        this.resize(500,500);
        noseve = imagen.getGraphics();
        gun = new Gun();
        balas = new ArrayList<Bala>();
        naves = new ArrayList<Nave>();
        for (int i = 0; i < 5; i++) {
            naves.add(new Nave());
        }
        
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
        noseve.setColor(Color.pink);
        noseve.fillRect(0, 0, 300, 500);
        gun.dibujar(noseve);
        for (int i=0; i < balas.size(); i++) {
            balas.get(i).dibujar(noseve);
        }
        for (int i = 0; i < naves.size(); i++) {
            naves.get(i).dibujar(noseve);
        }
        noseve.setColor(Color.red);
        noseve.setFont(new Font("Arial", Font.BOLD, 24));
        noseve.drawString("Puntuacion: " + puntuacion,15,30);
        if(fin){
            noseve.setColor(Color.pink);
            noseve.fillRect(0, 0, 300, 500);
            noseve.setColor(Color.red);
            noseve.setFont(new Font("Arial", Font.BOLD, 30));
            noseve.drawString("GANASTE!!", 70, 225);
        }
        if(loser){
            noseve.setColor(Color.red);
            noseve.setFont(new Font("Arial", Font.BOLD, 30));
            noseve.drawString("GAME OVER", 70, 225);
        }
        g.drawImage(imagen, 0, 0, this);
    }
    
    //RUN
    public void run(){
        do{
            for (int x = 0; x < balas.size(); x++) {
                balas.get(x).actualizar();
                if(balas.get(x).y < -10)
                    balas.remove(x);
            }
            /*otra manera para borrar la bala
            if(balas.size() > 0)
                if(balas.get(0).y <= 0)
                    balas.remove(0);*/
            
            for (int j = 0; j < naves.size(); j++) {
                naves.get(j).actualizar();
            }
            
            for (int i = 0; i < balas.size(); i++) {
                for (int j = 0; j < naves.size(); j++) {
                    if(balas.get(i).intersects(naves.get(j))){
                        puntuacion++;
                        balas.remove(j);
                        naves.remove(i);
                        break;
                    }
                }
                
            }
            
            for (int i = 0; i < naves.size(); i++) {
                if(naves.get(i).y == 500){
                    loser = true;
                    repaint();
                    animacion.stop();
                }
            }
            
            intervalo += TIEMPO;
            if(intervalo >= 1000){
                intervalo = 0;
                naves.add(new Nave());
            }
            
            if(puntuacion == 10){
                fin = true;
                repaint();
                animacion.stop();
            }
            repaint();
            try{
                Thread.sleep(TIEMPO);
            }catch(InterruptedException e){}
        }while(true);
    }
    
    /*public boolean keyDown(Event ev, int tecla){
        //para moverlo con las teclas, los codigos son 1006 y 1007
        if(tecla == 1006)
            gun.actualizar(IZDA);
        else if(tecla == 1007)
            gun.actualizar(DCHA);
        else if(tecla == 32){
            balas.add(new Bala(gun.x + 3)); //añadir al pulsar espacio
            //si fuese una sola bala en el metodo paint y run debes comprobar 
            //que la bala no sea null
        }
        return true;
    }*/
    
    public boolean mouseMove(Event eve, int x, int y){
        gun.actualizar(x);
        return true;
    }

    public boolean mouseDown(Event eve, int x, int y){
        balas.add(new Bala(x + 10));
        return true;
    }
}

