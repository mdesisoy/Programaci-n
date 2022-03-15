/*
Dada la tabla de salarios y el vector empleados, queremos que se 
muestre por pantalla, de cada empleado, su nombre y cuanto ha 
ganado en esos 6 mese de trabajo.

Para lo que se pide implementar una funcion que devuelva la suma de los salarios 
de un empleado.
 */
package primera;


public class Ejercicio052 {
    public static void main(String arg[]){
        int salarios[][] = {{700, 900, 1300, 800, 790, 850}, {1000, 950, 1080, 1070, 1200, 1100}, 
                                {1300, 930, 1200, 1170, 1000, 1000}, {1500, 1950, 1880, 1978, 2200, 2100}};
        String empleados[] = {"Javier Marías", "Antonio Muñoz", "Isabel Allende", "José Saramago"};
        int suma = 0;
        for(int i = 0; i < salarios.length; i++){
            suma = suma(salarios[i]);
            System.out.printf("El empleado %s ha ganado %d\n", empleados[i], suma); 
        }
    }
        
    public static int suma(int sal[]){ //mejor poner vectores en plural
        int suma = 0;
        for(int i = 0; i < sal.length; i++)
            suma += sal[i];
        return suma;
    }
}
