package Ejercicio12;

import java.applet.Applet;
import java.awt.*;

//dejo comentarios de la imagen para tenerlos más a mano

public class Mondrian2 extends Applet implements Runnable{
    Thread animacion;
    Image imagen;
    Graphics noseve;
    Rectangulo[] rectangulos;
    int posX[] = {0, 250, 80, 80, 100, 80, 200, 0, 200};
    int posY[] = {0, 0, 160, 220, 10, 100, 0, 110, 55};
    int anchuras[] = {90, 40, 100, 220, 90, 110, 45, 70, 60};
    int alturas[] = {90, 190, 120, 90, 80, 90, 45, 200, 135};
    Color colores[] = {Color.yellow, Color.yellow, Color.yellow, Color.blue, 
                        Color.blue, Color.lightGray, Color.red, Color.red, 
                        Color.magenta};
    
    //INIT
    public void init(){
        imagen = this.createImage(300,300); //metodo abstracto -> instanciamos imagen así
        noseve = imagen.getGraphics();//al crear la imagen ya está creado el objeto Graphics, está dentro de la imagen
        rectangulos = new Rectangulo[9]; //COMO DECLARAR VECTOR DE UNA CLASE
        for (int i = 0; i < rectangulos.length; i++) {
            rectangulos[i] = new Rectangulo(posX[i], posY[i], anchuras[i], 
                            alturas[i], colores[i]); //instanciamos rectangulos
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
        noseve.setColor(Color.black);
        noseve.fillRect(0, 0, 300, 300);
        for (int i = 0; i < rectangulos.length; i++) {
            rectangulos[i].dibuha(noseve); //dibujamos cada rectángulo
        }
        g.drawImage(imagen, 0, 0, this); //ahora en el objeto Graphics que si se ve 
                                         //dibujamos la imagen
                                         //this se refiere al applet
    }
    
    //RUN
    public void run(){
        do{
            for (int i = 0; i < rectangulos.length; i++) {
                rectangulos[i].actualizar(); 
            }
            repaint();
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){}
        }while(true);
    }
}
