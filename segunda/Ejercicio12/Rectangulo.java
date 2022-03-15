package Ejercicio12;

import java.awt.*;

public class Rectangulo {
    public static final int ARRIBA = 0;
    public static final int ABAJO = 1;
    public static final int DCHA = 2;
    public static final int IZDA = 3;
    int direccion;
    int inicial;
    int posX, posY, anchura, altura;
    Color color;
   
   //constructor
   public Rectangulo(int x, int y, int anchura, int altura, Color c){
       posX = x;
       posY = y;
       this.anchura = anchura;
       this.altura = altura;
       color = c;  
       direccion = DCHA;
       inicial = 0;
   }
   
   public void dibuha(Graphics illo){ 
       illo.setColor(color);
       illo.fillRect(posX, posY, anchura, altura);
   }
   
    public void actualizar() {
        switch(direccion){
            case ARRIBA:
                posY--;
                inicial++;
                if(inicial == 20){
                    direccion = DCHA;
                    inicial = 0;
                }
                break;
            case ABAJO:
                posY++;
                inicial++;
                if(inicial == 20){
                    direccion = IZDA;
                    inicial = 0;
                }
                break;
            case DCHA:
                posX++;
                inicial++;
                if(inicial == 20){
                    direccion = ABAJO;
                    inicial = 0;
                }
                break;
            case IZDA:
                posX--;
                inicial++;
                if(inicial == 20){
                    direccion = ARRIBA;
                    inicial = 0;
                }
        }
    }  
}
