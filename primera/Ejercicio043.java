/*
Ordenacion de un vector por el metodo de seleccion
 */
package primera;


public class Ejercicio043 {
    public static void main(String arg[]){
        int vector[] = {25, 2, 73, 81, 16, 4, 33};
        int aux = 0;
        int posMenor;
        for(int j = 0; j < vector.length - 1; j++){
            posMenor = j;
            for(int i = j; i < vector.length; i++) //empezar desde la j para que no salga siempre el mismo
                if(vector[i] < vector[posMenor])
                    posMenor = i;
                aux = vector[posMenor];
                vector[posMenor] = vector[j];
                vector[j] = aux;
                
        } 
        for(int i = 0; i < vector.length; i++)    
            System.out.printf(" %d ", vector[i]);
        System.out.println();
    }
}
