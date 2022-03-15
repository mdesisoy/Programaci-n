/*
Tenemos una tabla de 3*4 y cada elemento de la primera fila lo 
multiplicamos por un numero, cada elemento de la segunda lo 
multiplicaremos por otro y lo mismo con los elementos de la tercera fila
*/
package primera;

public class Ejercicio028 {
    public static void main(String arg[]){
        int tabla[][] = {{10, 20, -30, -40}, {50, 60, -70, 80}, {90, 100, -110, 120}};
        int v1[] = {2, 4, 6};
        for(int i = 0; i < tabla.length; i++){
            System.out.println("Vector multiplicado por " + v1[i]);
            for (int j = 0; j < tabla[i].length; j++)
                System.out.printf(" %d ", (v1[i]*tabla[i][j])); 
            System.out.println(); //final de cada linea de la tabla
        }
    }
}
