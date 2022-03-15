package Ejercicio11;
import java.awt.*;
//interface -> Runnable -> public void run(){}

public class Animacion1 extends Frame implements Runnable{ //obligacion implementar runnable
    Thread animacion; //proceso
    public int actual = 0;
    String frames[] = {"*","**","***","****","*****","******","*****","****","***","**","*"};
    
    public static void main(String args[]){
        Animacion1 app  = new Animacion1();
    }
    
    //constructor
    public Animacion1(){
        super("Animación sencilla");
        pack();
        resize(300,300);
        show();
        animacion = new Thread(this); //activar proceso en el que estamos
        animacion.start(); //metodo start llama al metodo run -> iniciar
    }
    
    public void paint(Graphics g){
        g.drawString(frames[actual], 50, 100);
    }
    
    //Bucle infinito
    public void run(){
        do{
            actual = (actual+1) % frames.length;
            repaint();
            try{
            Thread.sleep(300);
            }catch(InterruptedException e){}
        }while(true);
    }
    
    public boolean handleEvent(Event ev){
        if(ev.id == Event.WINDOW_DESTROY){ 
            System.exit(0);
            return true;
        }
        return false;
    }
}
