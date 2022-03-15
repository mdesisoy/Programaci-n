/*
Vectores
*/
package primera;

public class Ejercicio014 {
    public static void main(String arg[]){
        int datos[] = {17, 55, 33, 21, 88};
        //Mostrar elementos del vector
        for(int i = 0; i < datos.length; i++) //length para saber longitud del vector
            System.out.printf("datos[%d] = %d \n",i, datos[i]);
        //Multiplicar vector por 2
        for(int i = 0; i < datos.length; i++){
            datos[i] *= 2;
            System.out.printf("datos[%d] * 2 = %d \n",i, datos[i]);
        }
    }
}