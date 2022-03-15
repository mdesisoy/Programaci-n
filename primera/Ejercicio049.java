/*
Ordenar un vector en una funcion
 */
package primera;


public class Ejercicio049 {
    public static void main(String arg[]){
        int vector[] = {25, 2, 73, 81, 16, 4, 33};
        ordenar(vector);
        System.out.printf("El vector ordenado es: ");
        for(int i = 0; i < vector.length; i++)
            System.out.printf(" %d ", vector[i]);
        System.out.println();
    }
    
    public static void ordenar(int v[]){
        int aux = 0;
        int posMenor;
        for(int j = 0; j < v.length - 1; j++){
            posMenor = j;
            for(int i = j; i < v.length; i++)
                if(v[i] < v[posMenor])
                    posMenor = i;
                aux = v[posMenor];
                v[posMenor] = v[j];
                v[j] = aux;
                
        } 
    }
}
