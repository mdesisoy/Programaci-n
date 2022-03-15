/*
Mostrar por pantalla si un numero es multiplo de otro o no
teniendo x el mayor valor
*/
package primera;

public class Ejercicio007 {
    public static void main(String arg[]){
        int x, y, aux;
        x = 3;
        y = 21;
        if(x < y){ //Hacer que x tenga el valor mayor
            aux = y;
            y = x;
            x = aux; 
        }
        if(x % y == 0) //Ver si x es multiplo de y
            System.out.println(x + " es multiplo de " + y);
        else
            System.out.println(x + " no es multiplo de " + y);
    }
}
        