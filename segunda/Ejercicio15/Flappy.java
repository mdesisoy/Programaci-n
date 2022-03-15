package Ejercicio15;

import java.applet.Applet;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

public class Flappy extends Applet implements Runnable{
    public static final int TIEMPO = 40;
    public static final int SUBIR = 30;
    Thread animacion; 
    Image imagen;
    Graphics noseve;
    Pajaro pajaro;
    public List<Columna> columnas;
    int tiempoacumulado;
    boolean fin = false;
    //int puntuacion = 0;
    
    //INIT
    public void init(){
        imagen = this.createImage(300,300);
        this.resize(400,400);
        noseve = imagen.getGraphics();
        pajaro = new Pajaro();
        columnas = new ArrayList<Columna>();
        columnas.add(new Columna()); //si no lo pones siguen saliendo solo que 
                                     //tarda mas en aparecer la primera columna
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
        noseve.setColor(Color.gray);
        noseve.fillRect(0, 0, 300, 300);
        pajaro.dibujar(noseve);
        for (int i=0; i < columnas.size(); i++) {
            columnas.get(i).dibujar(noseve);
        }
        if(fin){
            noseve.setColor(Color.white);
            noseve.setFont(new Font("Arial", Font.BOLD, 24));
            noseve.drawString("GAME OVER", 80, 150);
        }
        //noseve.drawString("Puntuacion: "+puntuacion,15,50);
        g.drawImage(imagen, 0, 0, this);
    }
    
    //RUN
    public void run(){
        do{
            tiempoacumulado += TIEMPO;
            if(tiempoacumulado == 2000){
                tiempoacumulado = 0;
                columnas.add(new Columna());
            }
            pajaro.actualizar();
            for (int j=0; j<columnas.size(); j++) {
                columnas.get(j).actualizar();    
            }
            if(columnas.get(0).getArriba().x <= -columnas.get(0).getArriba().width) //anchura
                    columnas.remove(0);
            if(pajaro.intersects(columnas.get(0).getArriba()) || pajaro.intersects(columnas.get(0).getAbajo())){
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
    
    public boolean keyDown(Event ev, int tecla){
        if(tecla == 32)
            pajaro.y -= SUBIR;   
        return true;
    }
    
    /* CON RATÓN
    public boolean mouseDown(Event ev, int x, int y) {
        pajaro.y -= 25;
        return true; 
    }
    */
}


