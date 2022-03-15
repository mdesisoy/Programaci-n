/*
Copiar en cadena2 dos veces la cadena
 */
package primera;


public class Ejercicio067 {
    public static void main(String arg[]){
        char cadena[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r',
                        ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'm', 'a', 'n', 'c', 'h', 'a', ' '};
        char cadena2[] = new char[150];
        int pos;
        for(pos = 0; pos < cadena.length; pos++)
            cadena2[pos] = cadena[pos];  
        for(int i = 0; i < cadena.length; i++){
            cadena2[pos] = cadena[i]; //Empiezo desde la posicion anterior
            pos++;
        }
        System.out.println(cadena2);
        
        /* FORMA DE EDU
        for(int i = 0; i < 2; i++)
            for(int j = 0; j < cadena.length; j++)
                cadena2[i*cadena.length+j] = cadena[j];
        System.out.println(cadena2);
        */
    }
}
