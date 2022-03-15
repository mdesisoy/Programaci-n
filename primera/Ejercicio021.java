/*
Desplazar datos a la derecha
*/
package primera;

public class Ejercicio021 {
    public static void main(String arg[]){
        int datos[] = {10, 57, -109, 2, -88};
        int aux= datos[datos.length - 1];
        for(int i = datos.length - 2; i >= 0; i--) //for(int i = datos.length -1; i > 0;...)
            datos[i + 1] = datos[i];               //datos[i] = datos[i-1]; 
        datos[0] = aux;
        System.out.print("El vector queda: ");
        for(int i = 0; i < datos.length; i++)
            System.out.printf("%d ", datos[i]);
    }
}
