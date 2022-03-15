/*
Ordenacion por el metodo de insercion directa
 */
package primera;


public class Ejercicio044 {
    public static void main(String arg[]){
        int vector[] = {25, 2, 73, 81, 16, 4, 33};
        int aux;
        for(int i = 1; i < vector.length; i++){ 
        //mira primero los dos primeros y ordena, luego añade uno mas y 
        //ordena de nuevo y asi sucesivamente
            int cont = i;
            while((cont > 0) && (vector[cont] < vector[cont-1])){ //cont>0 para que no de error
                //comparacion del que estas con el anterior
                aux = vector[cont];
                vector[cont] = vector[cont-1];
                vector[cont-1] = aux;
                cont--;

            } 
        }
        for(int i = 0; i < vector.length; i++)    
            System.out.printf(" %d ", vector[i]);
        System.out.println();
    }
}
