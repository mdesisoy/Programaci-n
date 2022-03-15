/*
Mostrar por pantalla cuanto se ha vendido de cada producto
 */
package primera;


public class Ejercicio030 {
    public static void main(String arg[]){
        int tabla[][] = {{10, 20, 30, 40, 25}, {50, 60, 70, 80, 27}, {90, 100, 110, 120, 50}};
        String productos[] = {"Naranjas", "Peras", "Melones"};
        int suma[] = {0 ,0 ,0};
        int acum = 0; //para segunda parte
        for(int i = 0; i < tabla.length; i++){ //filas
            for(int j = 0; j < tabla[i].length; j++)
                suma[i] += tabla[i][j];
            System.out.printf("Hay %d kg de %s \n", suma[i], productos[i]);
        }  
        System.out.println();
        System.out.println();
        
        //Ahora utilizando la variable acum
        for(int i = 0; i < tabla.length; i++){ 
            for(int j = 0; j < tabla[i].length; j++){
                acum += tabla[i][j];
            }
            System.out.printf("Hay %d kg de %s \n", acum, productos[i]);
            acum = 0;
        }
    }
}
