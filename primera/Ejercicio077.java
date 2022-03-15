/*
Poner los nombres en orden alfabético
 */
package primera;


public class Ejercicio077 {
    public static void main(String arg[]){
        String nombres[] = {"Pepe", "Juan", "María", "Antonio", "Luisa"};
        String aux;
        int menor;
        for(int j = 0; j < nombres.length - 1; j++)
            for(int i = nombres.length-1; i > j; i--){
                menor = i-1;
                if (nombres[i].compareTo(nombres[menor]) < 0){
                    aux = nombres[i];
                    nombres[i] = nombres[menor];
                    nombres[menor] = aux;
                }
            }
        
        for(int i = 0; i < nombres.length; i++)    
            System.out.printf(" %s ", nombres[i]);
        System.out.println();
    }
}
