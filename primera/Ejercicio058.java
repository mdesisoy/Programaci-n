/*
Implementar una funcion que devuelva el numero de caracteres en blanco de una 
frase.
*/
package primera;


public class Ejercicio058 {
    public static void main(String arg[]){
        char caracter = 'H'; //en comillas simples, si no entiende que es string
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r',
                        ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'm', 'a', 'n', 'c', 'h', 'a'};
        System.out.printf("Tiene %d espacios en blanco y %d palabras\n", 
                          numeroEspacios(frase), numeroEspacios(frase)+1);
        
    }
    
    public static int numeroEspacios(char f[]){
        int contador = 0;
        for(int i = 0; i < f.length; i++)
           if (f[i] == ' ')
               contador++; 
        return contador;
    }
}
