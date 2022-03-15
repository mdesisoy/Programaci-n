package Ejercicio19;

import java.applet.Applet;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

public class JuegoDinosaurio extends Applet implements Runnable{
    public static final int TIEMPO = 30;
    public static final int SUBIR = 80;
    Thread animacion; 
    Image imagen;
    Graphics noseve;
    Dinosaurio dino;
    public List<Obstaculos> obstaculos;
    int tiempoacumulado;
    int puntuacion;
    boolean tonto = false;
    
    //INIT
    public void init(){
        imagen = this.createImage(500,300);
        this.resize(500,300);
        noseve = imagen.getGraphics();
        
        dino = new Dinosaurio();
        obstaculos = new ArrayList<Obstaculos>();
        obstaculos.add(new Obstaculos());
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
        noseve.setColor(Color.yellow);
        noseve.fillRect(0, 0, 500, 300);
        noseve.setColor(Color.gray);
        noseve.fillRect(0, 230, 500, 7);
        
        dino.dibujar(noseve);
        for (int i = 0; i < obstaculos.size(); i++) {
            obstaculos.get(i).dibujar(noseve);
        }
        
        //puntos
        noseve.setColor(Color.gray);
        noseve.setFont(new Font("Arial", Font.BOLD, 24));
        noseve.drawString("Puntuación: " + puntuacion, 60, 60);
        
        //pierdes
        if(tonto){
            noseve.setColor(Color.red);
            noseve.setFont(new Font("Arial", Font.BOLD, 50));
            noseve.drawString("Has perdido!", 90, 120);
            animacion.stop();
        }
        
        g.drawImage(imagen, 0, 0, this);
    }
    
    //RUN
    public void run(){
        do{
            tiempoacumulado += TIEMPO;
            if(tiempoacumulado >= 1000){
                tiempoacumulado = 0;
                obstaculos.add(new Obstaculos());
            }
            dino.actualizar();
            for (int j=0; j<obstaculos.size(); j++) {
                obstaculos.get(j).actualizar(); 
                if(obstaculos.get(j).x < -15){
                    obstaculos.remove(j);
                    puntuacion++;
                }
            }
            
            //interseccion
            if(dino.intersects(obstaculos.get(0))){
                tonto = true;
            }
            repaint();
            try{
                Thread.sleep(TIEMPO);
            }catch(InterruptedException e){}
        }while(true);
    }
    
    public boolean keyDown(Event ev, int tecla){
        if(tecla == 32)
            if(dino.y > 180)
                dino.y -= SUBIR;
            /*else if (tecla == 1005){
                dino.height = 22;
                dino.width = 40;
            }*/
        return true;
    }
}
