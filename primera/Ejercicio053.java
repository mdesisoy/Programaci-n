/*
Tenemos una tabla de enteros y un entero llamado multiplicador.
Queremos modificar el ontenido de todos los elementos de la tabla,
multiplicando cada uno de ellos por el multiplicador.
Vamos a crear una funcion que lo haga.
 */
package primera;


public class Ejercicio053 {
    public static void main(String arg[]){
        int tabla[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int multiplicador = 2;
        
        multiplicar(tabla, multiplicador);
        System.out.printf("La tabla multiplicada por %d es igual a:\n", multiplicador);
        for(int i  = 0; i < tabla.length; i++){
            for(int j = 0; j < tabla[i].length; j++)
                System.out.printf(" %d ", tabla[i][j]);
            System.out.println();
        }
    }
    
    public static void multiplicar (int tabla[][], int mul){
        for(int i  = 0; i < tabla.length; i++)
            for(int j = 0; j < tabla[i].length; j++)
                tabla[i][j] *= mul;
    }
}







