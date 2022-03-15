/*
Implementar una funcion que devuelva un vector con el numero de kilos vendidos de
cada producto.
En el programa principal, mostrar los resultados.
 */
package primera;


public class Ejercicio056 {
    public static void main(String arg[]){
        int kilos[][] = {{5, 6, 9, 23, 7, 14, 0}, {16, 8, 4, 33, 15, 21, 2}}; 
        String productos[] = {"Peras", "Manzanas"};
        int cantidad[] = new int [kilos.length]; 
        
        sumarVector(kilos,cantidad);
        for(int i = 0; i < cantidad.length; i++)
            System.out.printf(" Hay %d kilos de %s \n", cantidad[i], productos[i]);
    } 
    
    public static void sumarVector(int k[][], int v[]){
        for(int i = 0; i < k.length; i++)
            for(int j = 0; j < k[i].length; j++)
                v[i] += k[i][j];
    }
}
