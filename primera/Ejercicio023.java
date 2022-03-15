/*
Mover vector a la derecha tantas veces como elementos hay y mostrarlo
todas las veces por pantalla
*/
package primera;

public class Ejercicio023 {
    public static void main(String arg[]){
        int datos[] = {10, 57, -109, 2, -88};
        for(int i = 0; i < datos.length; i++){
            int aux= datos[datos.length - 1];
            for(int j = datos.length - 2; j >= 0; j--) //for(int i = datos.length -1; i > 0;...)
                datos[j + 1] = datos[j];               //datos[i] = datos[i-1]; 
            datos[0] = aux;
            System.out.print("\n El vector queda: ");
            for(int z = 0; z < datos.length; z++)
                System.out.printf("%d ", datos[z]);
        }
    }
}
