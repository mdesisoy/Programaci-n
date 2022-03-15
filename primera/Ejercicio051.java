/*
Funcion factorial
*/
package primera;


public class Ejercicio051 {
    public static void main(String arg[]){
        int num1 = 5;
        int num2 = 2;
        System.out.printf("El factorial del numero %d es: %d\n", num1, factorial(num1));
        
        System.out.printf("Variaciones de %d elementos tomados de %d en %d "
        + "es igual a %d\n", num1, num2, num2, (factorial(num1)/factorial(num2)));
        
        System.out.printf("Combinaciones de %d elementos tomados de %d en %d "
        + "es igual a %d\n", num1, num2, num2, (factorial(num1)/(factorial(num1-num2)*factorial(num2))));
    }
    
    public static int factorial(int n){
        int resultado = 1;
        for(int i = 1; i <= n; i++)
            resultado *= i;
        return resultado;
    }
}
