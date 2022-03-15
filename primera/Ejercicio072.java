/*
Eliminar caracter de la frase
 */
package primera;


public class Ejercicio072 {
    public static void main(String arg[]){
        char cadena[] = {'n', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r',
                        ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'm', 'a', 'n', 'c', 'h', 'a'};
        char caracter = 'n';
        
        int i = 0;
        while (i < cadena.length){
            if(cadena[i] == caracter){
                for (int j = i; j < cadena. length - 1; j++)
                    cadena[j] = cadena[j+1];
                cadena[cadena.length - 1] = ' '; //evitar que la ultima letra se quede repetida
                //longitud-- 
                //sirve para reducir el intervalo 
                //si igualas longitud a cadena.length
            }
            else
                i++;
        }        
        
        System.out.println(cadena);
    }
}
