/*
Division entera mediante restas
 */
package primera;


public class Ejercicio092 {
    public static void main(String arg[]){
        int a = 10;
        int b = 5;
        int resultado = dividir(a, b);
        System.out.println(resultado);
    }
    public static int dividir(int num1, int num2){
        if(num1 < num2)
            return 0;
        else
            return 1 + dividir(num1-num2,num2); //contador
    }
}
