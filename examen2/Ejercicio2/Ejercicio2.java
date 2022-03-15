/*
Vais a representar la lluvia.  
Las gotas serán azules, en forma de óvalo vertical, todas con el mismo tamaño. 
Caerán también verticalmente y en línea recta.  Partirán de la parte superior, 
fuera del Applet.  Cuando tocan tierra desaparecen de la lista..
 */

package Ejercicio2;

import java.applet.Applet;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

public class Ejercicio2 extends Applet implements Runnable{
    public static final int TIEMPO = 30;
    Thread animacion; 
    Image imagen;
    Graphics noseve;
    List<Gota> gotas;
    int tiempoacum;
    
    //INIT
    public void init(){
        imagen = this.createImage(300,300);
        this.resize(400,400);
        noseve = imagen.getGraphics();
        
        gotas = new ArrayList<Gota>();
        for (int i = 0; i < 5; i++) {
            gotas.add(new Gota());
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
        noseve.setColor(Color.gray);
        noseve.fillRect(0, 0, 300, 300);
        
        for (int i = 0; i < gotas.size(); i++) {
            gotas.get(i).dibujar(noseve);
        }
        
        g.drawImage(imagen, 0, 0, this);
    }
    
    //RUN
    public void run(){
        do{
            for (int i = 0; i < gotas.size(); i++) {
                gotas.get(i).actualizar();
                if(gotas.get(i).y == 350)
                    gotas.remove(i);
            }
            tiempoacum += TIEMPO;
            if(tiempoacum >= 500){
                tiempoacum = 0;
                gotas.add(new Gota());
            }
            repaint();
            try{
                Thread.sleep(TIEMPO);
            }catch(InterruptedException e){}
        }while(true);
    }
}
