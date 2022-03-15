/*
Acumular las sumas de una tabla por filas en un vector y también por 
columnas en otro
 */
package primera;


public class Ejercicio029 {
    public static void main(String arg[]){
        int tabla[][] = {{10, 20, -30, -40}, {50, 60, -70, 80}, {90, 100, -110, 120}};
        int v1[] = {0, 0, 0, 0};
        int v2[] = {0, 0, 0};
        for(int i = 0; i < tabla.length; i++)        //filas
            for(int j = 0; j < tabla[i].length; j++){//columnas
                v2[i] += tabla[i][j];
                v1[j] += tabla[i][j];
            } 
        for(int i = 0; i < v2.length; i++)
            System.out.printf("Suma fila %d es %d\n", i, v2[i]);
        for(int j = 0; j < v1.length; j++)
            System.out.printf("Suma columna %d es %d\n", j, v1[j]);
        
    }
}
