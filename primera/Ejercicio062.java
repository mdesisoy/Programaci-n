/*
Funcion que devuelva una cadena de caracteres nueva sustituyendo el caracter a 
por la cadena de caracteres
 */
package primera;


public class Ejercicio062 {
    public static void main(String arg[]){
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r',
                        ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'm', 'a', 'n', 'c', 'h', 'a', ' '};
        char sustituir = 'a';
        char sustituto[] = {'X', 'X', 'R'};
        
        char frase2[] = sustituir(frase, sustituir, sustituto);
        System.out.println(frase2);
    }
    
    
    
    public static char [] sustituir(char[] f, char s, char[] sus){
        char f2[] = new char[100];
        int cont = 0;
        for(int i = 0, j = 0; i < f.length; i++){ 
            if(f[i] == s){
                while(cont < sus.length){//for(int k=0;k<sus.length;k++)
                    f2[j++] = sus[cont]; //f2[j++] = sus [k]
                    cont++;              
                }
                cont = 0;
            }
            else
                f2[j++] = f[i]; //lamadas en modo incrementativo
        }
        return f2;
    }
        
}
