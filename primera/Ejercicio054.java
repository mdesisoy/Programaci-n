/*
Tenemos un array bidimensional de doubles, con los kilos vendidos de dos
productos cada dia de la semana.
Y un vector de doubles con los precios de los productos.
Hacer una función que sea capaz de modificar el contenido de la tabla,
multiplicando los kilos por el precio del producto.
 */
package primera;


public class Ejercicio054 {
    public static void main(String arg[]){
        double kilos[][] = {{5, 6, 9, 23, 7, 14, 0}, {16, 8, 4, 33, 15, 21, 2}};
        double precios[] = {3.5, 2.2};
        
        multiplicar(kilos,precios);
        for(int i  = 0; i < kilos.length; i++){
            for(int j = 0; j < kilos[i].length; j++)
                System.out.printf(" %.2f ", kilos[i][j]);
            System.out.println();
        }
    }
    
    public static void multiplicar(double t[][], double p[]){
        for(int i  = 0; i < t.length; i++)
            for(int j = 0; j < t[i].length; j++)
                t[i][j] *= p[i]; 
    }
}
