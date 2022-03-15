/*
Convertir elem negativos del vector en positivos y los positivos 
se multipliquen por 2
*/
package primera;

public class Ejercicio018 {
    public static void main(String arg[]){
        int datos[] = {-10, 57, -109, 2, -88}; 
        for(int i = 0; i < datos.length; i++){
            if(datos[i] < 0)
                datos[i] = - datos[i]; //datos[i] *= -1;
            else
                datos[i] *= 2;  
        }
        System.out.print("El vector queda: ");
        for(int i = 0; i < datos.length; i++)
            System.out.printf("%d ", datos[i]);
    }
}