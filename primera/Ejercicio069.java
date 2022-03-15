/*
Copiar en cadena 2 el contenido de cadena dos veces.
La primera vez normal y la segunda con las letras al revés
 */
package primera;


public class Ejercicio069 {
    public static void main(String arg[]){
        char cadena[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r',
                        ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'm', 'a', 'n', 'c', 'h', 'a', ' '};
        char cadena2[] = new char[150];
        int pos;
        for(pos = 0; pos < cadena.length; pos++)
            cadena2[pos] = cadena[pos];  
        for(int i = cadena.length-1; i>=0; i--,pos++)
            cadena2[pos]=cadena[i];
        System.out.println(cadena2);
    }
}
