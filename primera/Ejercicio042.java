/*
Ordenacion de un vector por el metodo de la burbuja
 */
package primera;


public class Ejercicio042 {
    public static void main(String arg[]){
        int vector[] = {25, 2, 73, 81, 16, 4, 33};
        int aux = 0;
        int menor;
        for(int j = 0; j < vector.length -1; j++) //Bucle n-1 veces para ordenar
            //Para ser mas eficiente cambiar i > 0 por i > j, 
            //asi no repite iteraciones
            for(int i = vector.length-1; i > j; i--){ //n-1 iteraciones
                menor = i-1;
                if(vector[i] < vector[menor]){
                    aux = vector[i];
                    vector[i] = vector[menor];
                    vector[menor] = aux;
                }
            }
        for(int i = 0; i < vector.length; i++)    
            System.out.printf(" %d ", vector[i]);
        System.out.println();
    }
}
