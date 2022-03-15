/*
Realizar una funcion recursiva que realice la multiplicacion de dos numeros
mediante sumas.
 */
package primera;


public class Ejercicio090 {
    public static void main(String arg[]){
        int a = 3;
        int b = 2;
        int resultado = multiplicar(a, b);
        System.out.println(resultado);
    }
    public static int multiplicar(int num1, int num2){
        if(num2 == 0) //mejor poner 0 como finalizacion a 1
            return 0;
        else
            return num1 + multiplicar(num1, num2 -1);
    }
}
