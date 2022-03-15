/*
Valor mayor y la posición
*/
package primera;


public class Ejercicio015 {
    public static void main(String arg[]){
        int datos[] = {-10, -57, -109, -2, -88};
        int mayor = datos[0];
        int posicion = 0;
        for(int i = 1; i < datos.length; i++){
            if(mayor < datos[i]){
                mayor = datos[i];
                posicion = i;
            }
        }
        
        /* CON WHILE:
        int i = 1;
        while (i < datos.length){
            if(mayor < datos[i]){
                mayor = datos[i];
            }
             i++;
        }
        */
        System.out.printf("El numero mayor es %d y está en la posición %d \n", mayor, posicion);
        
        // Otro método para sacar mayor y posicion sin usar la variable mayor
        int posMax = 0;
        for(int i =1; i < datos.length; i++){
            if(datos[i] > datos[posMax])
                posMax = i;
        }
        System.out.printf("Valor max en posicion %d y es %d \n", posMax, datos[posMax]);
    }
}
