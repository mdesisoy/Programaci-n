/*
Desplazar datos a la izquierda
*/
package primera;

public class Ejercicio020 {
    public static void main(String arg[]){
        int datos[] = {10, 57, -109, 2, -88};
        int aux= datos[0];
        for(int i = 1; i < datos.length; i++)
            datos[i-1] = datos[i];  
        datos[datos.length - 1] = aux;
        System.out.print("El vector queda: ");
        for(int i = 0; i < datos.length; i++)
            System.out.printf("%d ", datos[i]);
    }
}
