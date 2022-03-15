/*
Calcular la media de los elementos del vector
*/
package primera;

public class Ejercicio019 {
    public static void main(String arg[]){
        int datos[] = {10, 57, -109, 2, -88};
        int media = 0;
        for(int i = 0; i < datos.length; i++){
            media += datos[i];
        }
        media /= datos.length;
        System.out.printf("La media de los elementos del vector es: %d \n", media);
    }
}
