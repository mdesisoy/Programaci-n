/*
Extraer una subcadena de una cadena. Función substring
 */
package primera;


public class Ejercicio078 {
    public static void main(String arg[]){
        String frase = "En un lugar de La Mancha"; 
        int inicio = 7;
        int fin = 19;
        System.out.printf("La subcadena contiene: %s\n", frase.substring(inicio, fin));
        System.out.printf("La subcadena contiene: %s\n", frase.substring(inicio));
    }
}
