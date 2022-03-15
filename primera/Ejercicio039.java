/*
Cambiar filas y columnas en la tabla, sin usar tabla auxiliar
*/
package primera;

public class Ejercicio039 {
    public static void main(String arg[]){
        int tabla[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int aux = 0;
        System.out.println("TABLA 1 tras el cambio:");
        for(int i = 1; i < tabla.length; i++) 
            for (int j = 0; j < i ; j++){ //También for(int j = i; j < tabla[i].length...)
                aux = tabla[i][j];
                tabla[i][j] = tabla[j][i];
                tabla[j][i] = aux;   
            }
        for(int i = 0; i < tabla.length; i++){
            for (int j = 0; j < tabla[i].length ; j++)
                System.out.printf(" %d ", tabla[i][j]);
            System.out.println();
        }
    }
}
