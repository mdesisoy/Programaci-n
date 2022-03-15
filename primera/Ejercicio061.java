/*
Sustituir caracter a por el caracter x en mayuscula
 */
package primera;

public class Ejercicio061 {
    public static void main(String arg[]){
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r',
                        ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'm', 'a', 'n', 'c', 'h', 'a'};
        char sustituir = 'a';
        char sustituto = 'X';
        
        sustituir(frase, sustituir, sustituto);
        System.out.println(frase);
    }
    
    
    public static void sustituir(char f[], char s, char sus){
       for(int i = 0; i < f.length; i++)
           if(f[i] == s)
               f[i] = sus;
    }
}
