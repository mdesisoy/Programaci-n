/*
Multiplicar un vector por otro
*/
package primera;

public class Ejercicio024 {
    public static void main(String arg[]){
        int datos[] = {10, 20, 30, 40, 50, 60};
        int multiplos[] = {3, 5, 7};
        for(int i = 0; i < multiplos.length; i++){
            System.out.print("El vector queda: ");
            for(int j = 0; j < datos.length; j++)
                System.out.printf(" %d ", multiplos[i]*datos[j]);  
            System.out.println();
        }   
    }  
}
