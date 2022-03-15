/*
Invertir el contenido de una cadena en otra
 */
package primera;


public class Ejercicio068 {
    public static void main(String arg[]){
        char cadena[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r',
                        ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'm', 'a', 'n', 'c', 'h', 'a', ' '};
        char cadena2[] = new char[150];
        char aux;
        
        for(int i = 0; i < (cadena.length/2)+1; i++){ 
            //sin el +1 no sale la d porque si es impar la frase no copiaría el contenido del medio
            cadena2[i] = cadena[(cadena.length-1)-i];
            cadena2[(cadena.length-1)-i] = cadena[i];
        }
        System.out.println(cadena2);
        
        
        /*MANERA AGUSTIN
        for(int i = cadena.length-1, j = 0; i>=0; i--,j++)
            cadena2[j]=cadena[i];
        */
    }
}
