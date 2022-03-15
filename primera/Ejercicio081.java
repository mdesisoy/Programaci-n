/*
Sustituir la subcadena "en" por esta misma pero en mayúsculas.
Concatenar dos string con la funcion de concatenar (concat)
 */
package primera;


public class Ejercicio081 {
    public static void main(String arg[]){
        String nombres[] = {"en un lugar", "en la Mancha", "dende se", "opina mucho"};
        String subcadena = "en";
        
        for(int i = 0; i < nombres.length; i++)
            //toUpperCase en un string
            nombres[i] = nombres[i].replace(subcadena, subcadena.toUpperCase());
        nombres[0] = nombres[0].concat("xdddd"); //concatenar
        
        for(int i = 0; i < nombres.length; i++)
            System.out.printf("%s ",nombres[i]);
        System.out.println();
    }
}
