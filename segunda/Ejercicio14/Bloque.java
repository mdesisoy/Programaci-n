package Ejercicio14;

import java.awt.*;

public abstract class Bloque extends Rectangle{ 
    //no se pueden instanciar objetos de esta clase -> abstract
    public static final Color COLORES[] = {Color.white, Color.pink, 
                                            Color.red, Color.orange, Color.lightGray};
    Color color;
    
    //constructor
    public Bloque(int posx, int posy, int anchura, int altura, Color color){
        super(posx, posy, anchura, altura);
        this.color = color;
    }
    
    public abstract void dibujar(Graphics j);
    
    /*Para hacer el ovalo se podría hacer una 
    * subclase pelota de bloque y sobreescribir
    * "dibujar" con fillOval.

    * Pero lo vamos a resolver de manera que Bloque sea una superclase de cada 
    * cosa (pelota, ladrillo, etc), por lo tanto no podemos instanciar 
    * objetos de esta clase. Las clases de las distintas cosas están obligadas
    * implementar la función "dibujar".
    */
}
