/*
Cadena de caracteres, tienes una subcadena:
Mostrar por pantalla numero de veces que la subcadena se encuentra
dentro de la cadena.
nnn como subcadena en 'nnnn' está 2 veces y en 'nnnnn' 3 veces
 */
package primera;


public class Ejercicio064 {
    public static void main(String arg[]){
        char cadena[] = {'E', 'n', 'n', 'n', 'n', ' ', 'u', 'n', 'n', 'n', 'n', 'n', ' ', 'l', 'u', 'g', 'a', 'r',
                            ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'm', 'a', 'n', 'n', 'c', 'h', 'a', ' '};
        char subcadena[] = {'n', 'n', 'n'};
        int contador = 0;
        for(int i = 0; i < (cadena.length - subcadena.length)+1; i++)
            if(cadena[i] == subcadena[0]){
                int j = 1;
                //se debe poner primero el length para que no se bugee por tener
                //a falso subcadena = cadena
                while(j<subcadena.length && subcadena[j] == cadena[i+j]){ //para no salise del bucle
                    j++;
                    if(j == subcadena.length)
                        contador++;
                }
            }
        System.out.println("Subcadena encontrada " + contador + " veces");
    }
}
