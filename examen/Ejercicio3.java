/*
Realizar una función que sea capaz de multiplicar una tabla de enteros 
de dimensiones 4*4, por un vector de 4 enteros y devuelva una nueva tabla 
con el contenido de dicha multiplicación.  Mostrar la tabla resultante 
por pantalla
 */
package examen;

public class Ejercicio3 {
    public static void main(String arg[]){

        int tabla[][] = {{1, 2, 3, 4},{5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int v[] = {1, 2, 3, 4};
        int tabla2[] = new int [v.length];
    
        for(int i = 0; i < tabla.length; i++){
            for(int j = 0; j < tabla[i].length; j++){
                tabla2[i] += tabla[i][j]*v[j];
            }
            System.out.println(tabla2[i]);
        }
    }
}
