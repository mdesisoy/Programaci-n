/*
Funcion que devuelva la cadena de caracteres sustituyendo el caracter a 
por la cadena de caracteres X X R 
 */
package primera;


public class Ejercicio063 {
    public static void main(String arg[]){
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r',
                        ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'm', 'a', 'n', 'c', 'h', 'a', ' '};
        char sustituir = 'a';
        char sustituto[] = {'X', 'X', 'R'};
        char frase2[] = new char[100];
        
        for(int i = 0; i < frase.length; i++)
            frase2[i] = frase[i];
        sustituir(frase2, sustituir, sustituto);
        System.out.println(frase2);
    }
    
    
    public static void sustituir(char[] f, char s, char[] sus){
    //CODIGO EDU
        for (int i = 0; i < f.length; i++) { //aqui iría longitud
            if (f[i] == s) {
                f[i] = sus[0];
                for (int k=sus.length-1; k  > 0; k--) { // susV.length-1
                    for (int j = f.length-1; j > i; j--) //aqui iría longitud
                        //mover hacia la derecha la frase tantas veces como carácteres quieras insertar
                        f[j] = f[j-1];
                    f[i+1] = sus[k];
                    System.out.println(sus[k]);
                }
                // Arregla el problema del caracter sustituto
                // en el vector para sustituir.
                i += sus.length;
            }
        }
    }
}
/*
// CODIGO DE AGUSTIN:
    for (int i=0; i<longitud; i++) {
        if (s1 == fr[i]) {
            fr[i] = s2[0];
            for (int x=1; x<s2.length; x++) {
                for (int j=longitud-1; j>i; j--)
                    fr[j] = fr[j-1];
                longitud++;
                fr[++i] = s2[x];
            }
        }
    }
*/

