/*
RECURSIVIDAD
Calcular el factorial de un número, llamando a una función recursiva
 */
package primera;


public class Ejercicio089 {
    public static void main(String arg[]){
        int n = 5;
        int resultado = factorial(n);
        System.out.println(resultado);
    }
    
    public static int factorial(int num){
        if(num == 1)
            return 1; //caso base para poder terminar
        else
            return num * factorial(num-1); //recursividad
    }
}
