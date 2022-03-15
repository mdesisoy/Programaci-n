/*
Hacer una funcion que devuelva el valor maximo de un vector de enteros
*/
package primera;

public class Ejercicio046 {
    public static void main(String arg[]){
        int vector1[] = {24, 45, 65, 12, 7, 123, 16, 50};
        int vector2[] = {14, 5, 65, 128, 7, 123, 160, 150};
        System.out.printf("El valor maximo del vector 1 es %d\n", maximo(vector1));
        System.out.printf("El valor maximo del vector 2 es %d\n", maximo(vector2));
    }
    
    public static int maximo(int v1[]){
        int pos = 0;
        for(int i = 1; i < v1.length; i++)
            if(v1[i] > v1[pos])
                pos = i;
        return v1[pos];
    }
}



