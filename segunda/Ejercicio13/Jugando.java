package Ejercicio13;

import java.applet.Applet;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

public class Jugando extends Applet implements Runnable{
    public static final int NUM_PELOTAS= 10;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    //Pelota pelota;        //una pelota
    
    //Pelota pelotas[];     //vector de 10 pelotas
    
    List<Pelota> pelota;    //lista de pelotas
    
    //INIT
    public void init(){
        imagen = this.createImage(300,300);
        noseve = imagen.getGraphics();
        //pelota = new Pelota();    //una pelota
        
        /*pelotas = new Pelota[NUM_PELOTAS];            //vector de 10 pelotas
        for (int i = 0; i < pelotas.length; i++) {
            pelotas[i] = new Pelota(); 
        }*/
        
        pelota = new ArrayList<Pelota>();               //lista de pelotas
        for (int i = 0; i < NUM_PELOTAS; i++) {
            pelota.add(new Pelota()); //añadir pelotas a la lista
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
        noseve.setColor(Color.white);
        noseve.fillRect(0, 0, 300, 300); //Para que se vea la pelota y no un churro
        //pelota.dibujar(noseve);   //una pelota
        
        /*for (int i = 0; i < pelotas.length; i++) {        //vector de 10 pelotas
            pelotas[i].dibujar(noseve);
        }*/
        
        for (int i = 0; i < pelota.size(); i++) {           //lista de pelotas
            pelota.get(i).dibujar(noseve); //dibujar cada elemento
        }
        g.drawImage(imagen, 0, 0, this);
    }
    
    //RUN
    public void run(){
        do{
            //pelota.actualizar();      //una pelota
            
            /*for (int i = 0; i < pelotas.length; i++) {    //vector de 10 pelotas
                pelotas[i].actualizar();
            }*/
            
            for (int i = 0; i < pelota.size(); i++) {       //lista de pelotas
                pelota.get(i).actualizar();
            }
            repaint();
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){}
        }while(true);
    }
    
    public boolean mouseDown(Event ev, int x, int y){
        for (int i = 0; i < pelota.size(); i++) {
            if(pelota.get(i).contains(x, y)) //get devuelve un obj de la clase pelota
                pelota.remove(i);
        }
        return true;
    }
}

