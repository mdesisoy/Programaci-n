package Ejercicio17;

import java.applet.Applet;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

public class Juego extends Applet implements Runnable{
    public static final int TIEMPO = 20;
    public static final int IZDA = 0;
    public static final int DCHA = 1;
    Thread animacion; 
    Image imagen;
    Graphics noseve;
    //Coche coche;
    public List<Coche> coche1;
    public List<Coche> coche2;
    Rana rana;
    int tiempoacum;
    boolean fin = false;
    boolean ganas = false;
    int vidas = 3;
    int timer;
    
    Rectangle carretera1;
    Rectangle carretera2;
    
    //INIT
    public void init(){
        imagen = this.createImage(500,300);
        this.resize(500,300);
        noseve = imagen.getGraphics();
        //coche = new Coche(0,((int)(Math.random()* 50) + 98) - 10);
        //coche = new Coche(500,((int)(Math.random()* 152) + 98));
        coche1 = new ArrayList<Coche>();
        coche2 = new ArrayList<Coche>();
        coche1.add(new Coche(-40,(int)(Math.random()* 78) + 50));
        coche2.add(new Coche(500,(int)(Math.random()* 78) + 152));
        
        rana = new Rana();
        
        //Seis segundos para pasarse el juego
        timer = 6000;
        
        carretera1 = new Rectangle(-30, 50, 560, 98);
        carretera2 = new Rectangle(-30, 152, 560, 98);
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
        noseve.fillRect(0, 0, 500, 300);
        noseve.setColor(Color.black);
        noseve.fillRect( carretera1.x, carretera1.y, carretera1.width, carretera1.height);
        noseve.fillRect( carretera2.x, carretera2.y, carretera2.width, carretera2.height);
        
        //coche.dibujar(noseve);
        for (int i=0; i < coche1.size(); i++) {
            coche1.get(i).dibujar(noseve);
        }
        for (int i=0; i < coche2.size(); i++) {
            coche2.get(i).dibujar(noseve);
        }
        rana.dibujar(noseve);
        
        noseve.setColor(Color.white);
        noseve.setFont(new Font("Arial", Font.BOLD, 25));
        noseve.drawString("Vidas: " + vidas, 1, 30);
        
        noseve.setColor(Color.white);
        noseve.setFont(new Font("Arial", Font.BOLD, 25));
        noseve.drawString("Timer: " + timer, 355, 30);
        
        if(fin){
            noseve.setColor(Color.white);
            noseve.setFont(new Font("Arial", Font.BOLD, 30));
            noseve.drawString("GAME OVER!!", 150, 110);
            animacion.stop();
        }
        
        if(ganas){
            noseve.setColor(Color.white);
            noseve.setFont(new Font("Arial", Font.BOLD, 30));
            noseve.drawString("GANASTE!!", 150, 110);
            animacion.stop();
        }
        g.drawImage(imagen, 0, 0, this);
    }
    
    //RUN
    public void run(){
        do{
            updateMovimientoCoche();
            
            //movimiento ondulado
            for (int i = 0; i < coche1.size(); i++) {
                if(!carretera1.contains(coche1.get(i)))
                    coche1.get(i).setVely(-coche1.get(i).getVely());
            }
            for (int i = 0; i < coche2.size(); i++) {
                if(!carretera2.contains(coche2.get(i)))
                    coche2.get(i).setVely(-coche2.get(i).getVely());
            }
            //Interseccion y vidas
            for (int i = 0; i < coche1.size(); i++) {
                for (int j = 0; j < coche2.size(); j++) {
                    if(rana.intersects(coche1.get(i))){
                        vidas -= 1;
                        coche1.remove(i);
                    }
                    else if(rana.intersects(coche2.get(j))){
                        vidas -= 1;
                        coche2.remove(j);
                    }
                
                }
            }
                
            if (vidas == 0){
                fin = true;
            }
            
            //Tiempo para acabar
            timer -= TIEMPO;
            if(timer == 0)
                fin = true;
            
            //Ganar
            if(rana.y < 20)
                ganas = true;
            
            repaint();
            try{
                Thread.sleep(TIEMPO);
            }catch(InterruptedException e){}
        }while(true);
    }

    public void updateMovimientoCoche() {
        tiempoacum += TIEMPO;
        if(tiempoacum == 500){
            tiempoacum = 0;
            coche1.add(new Coche(-40,(int)(Math.random()* 78) + 50));
            coche2.add(new Coche(500,(int)(Math.random()* 78) + 152));
        }
        for (int i = 0; i < coche1.size(); i++) {
            coche1.get(i).actualizar(DCHA);
            if(coche1.get(i).x > 500)
                coche1.remove(i);
        }
        for (int j = 0; j < coche2.size(); j++) {
            coche2.get(j).actualizar(IZDA);
            if(coche2.get(j).x < -40)
                coche2.remove(j);
        }
    }
    
    public boolean keyDown(Event ev, int tecla){
        rana.actualizar(tecla);
        //para mover solo arriba poner sin parametro
        return true;
    }
}

