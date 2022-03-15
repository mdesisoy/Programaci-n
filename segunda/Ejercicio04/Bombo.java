package Ejercicio04;
import java.util.Random; //importar una clase de java

public class Bombo {
    private int bolas [];
    Random aleatorio;
    private int numBolas = 48; //puedes hacer getter y setter si lo vas a 
                               //usar fuera de la clase
    
    //constructor
    public Bombo(){
        bolas = new int [numBolas];
        for (int i = 0; i < numBolas; i++) {
            bolas[i] = i+1;
        }
        aleatorio = new Random();
    }
    
    public int sacar(){
        int x = 0, numAle = 0;
        numAle = aleatorio.nextInt(numBolas); //pasar en la funcion el tope
                                              //coge de 0 a numBolas-1
        x = bolas[numAle];
        bolas[numAle] = bolas[numBolas-1];
        numBolas--;
        return x;
    }
}
