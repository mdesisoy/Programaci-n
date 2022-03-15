/*
Modificacion de la cadena de caracteres pasando todos los caracteres 
a mayusculas
*/
package primera;


public class Ejercicio060 {
    public static void main(String arg[]){
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r',
                        ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'm', 'a', 'n', 'c', 'h', 'a'};
        pasarAMayus(frase);
        System.out.println(frase);
    }
    
    public static void pasarAMayus(char f[]){
        //character.toUpperCase(char)
        for(int i = 0; i < f.length; i++)
            f[i] = Character.toUpperCase(f[i]);
    }
}
