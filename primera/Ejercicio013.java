/*
Divión entera mediante restas
*/
package primera;

public class Ejercicio013 {
    public static void main(String arg[]){
        int x = 27; //También se puede guardar la x en una variable auxiliar
        int y = 5;
        int resultado = 0;
        while(x >= y){
            x -= y;
            resultado++;
        }
        x += resultado * y;
        System.out.printf("La división entera de %d entre %d es %d \n", x, y, resultado);
    }
}
