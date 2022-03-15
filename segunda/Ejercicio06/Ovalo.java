package Ejercicio06;
import Ejercicio05.*;
import java.awt.Color; //en vez de Color poner * para importar todo el paquete
import java.util.Random;  
import java.awt.Graphics;

public class Ovalo {
    int anchura;
    int altura;
    int posX, posY;
    Color color;
    Random r;
    
    //constructor
    public Ovalo(){
        r = new Random();
        inicializar(); 
    }

    public void inicializar() {
        anchura = r.nextInt(100); //valores entre 0 y 100 con el 100 incluido
        altura = r.nextInt(100);
        posX = r.nextInt(200);
        posY = r.nextInt(200);
        color = new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255));
    }
    
    public void dibuyar(Graphics hoja){
        hoja.setColor(color);
        hoja.fillOval(posX, posY, anchura, altura);
    }
}




