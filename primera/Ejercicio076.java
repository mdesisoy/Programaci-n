/*
Tratar con strings. Metodo charAt, espera recibir un entero 
con la posicion de caracter del string que va a devolver.
 */
package primera;


public class Ejercicio076 {
    public static void main(String arg[]){
        String frase = "En un lugar de La Mancha"; //objeto de tipo puntero
        //String es una clase, char es un tipo de dato
        //Las clases van en mayusc.
        char cadena[] = new char[150];
        
        
        for(int i = 0; i < frase.length(); i++)
            System.out.printf("'%c' ", frase.charAt(i)); 
            //devuelve el caracter de la posicion que le pases
            
        for(int i = 0; i < frase.length(); i++)
            cadena[i] = frase.charAt(i);
        
        System.out.println();
        System.out.println(cadena);
    }
}
