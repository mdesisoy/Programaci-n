package Ejercicio20;

import java.applet.Applet;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

public class JuegoPelotas extends Applet implements Runnable{
    public static final int TIEMPO = 30;
    public static final int SUBIR = 80;
    Thread animacion; 
    Image imagen;
    Graphics noseve;
    //Pelota pelota;
    public List<Pelota> pelotas;
    int dim;
    
    //INIT
    public void init(){
        imagen = this.createImage(500,300);
        this.resize(500,300);
        noseve = imagen.getGraphics();
        
        //pelota = new Pelota(50);
        pelotas = new ArrayList<Pelota>();
        pelotas.add(new Pelota(200, 190, 50));
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
        noseve.fillRect(0, 0, 500, 300);
        
        //pelota.dibujar(noseve);
        for (int i = 0; i < pelotas.size(); i++) {
            pelotas.get(i).dibujar(noseve);
        }
        
        g.drawImage(imagen, 0, 0, this);
    }
    
    //RUN
    public void run(){
        do{
            //pelota.actualizar();
            for (int i = 0; i < pelotas.size(); i++) {
                pelotas.get(i).actualizar(); 
            }
            repaint();
            try{
                Thread.sleep(TIEMPO);
            }catch(InterruptedException e){}
        }while(true);
    }

    public boolean mouseDown(Event eve, int x, int y) {
        for (int i = 0; i < pelotas.size(); i++) {
            if(pelotas.get(i).contains(x, y))
                if(pelotas.get(i).height >= 15){
                    dim = pelotas.get(i).height /= 2;
                    pelotas.get(i).width /= 2;
                    pelotas.add(new Pelota(dim, pelotas.get(i).x, pelotas.get(i).y));
                }
        }
        
        return true;
    }
}
