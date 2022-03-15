/*
Implementar dos funciones similares que carguen fraseMod con los caracteres de 
frase pero añadiendo al final de la palabra una 'x'.
En la primera la funcion no devolverá nada y en la segunda la funcion devolverá
una cadena de caracteres.
 */
package primera;

public class Ejercicio059 {
    public static void main(String arg[]){
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r',
                        ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'm', 'a', 'n', 'c', 'h', 'a', ' '};
        //Mostrar frase sin cambio
        System.out.println("La frase antes del cambio:");
        for(int i = 0; i < frase.length; i++)
            System.out.printf("%c", frase[i]);
        System.out.println();
        System.out.println();
        
        System.out.println("La frase después sustituir los espacios por x:");
        //FORMA 1
        char fraseMod[] = new char [50];
        sustituir(frase, fraseMod);
        /*for(int i = 0; i < fraseMod.length; i++)
            System.out.printf("%c", fraseMod[i]);
        System.out.println();*/
        System.out.println(fraseMod); //Otra forma mas rapida
        
        //FORMA2
        char fraseMod2[] = sustituir2(frase);
        /*for(int i = 0; i < fraseMod2.length; i++)
            System.out.printf("%c", fraseMod2[i]);
        System.out.println();*/
        System.out.println(fraseMod2);
    }
    
    public static void sustituir(char f[], char fmod[]){
        for(int i = 0, j = 0; i < f.length; i++, j++){
            if(f[i] == ' '){
                fmod[j] = 'x';
                j++;
            }
            fmod[j] = f[i];
        }
    }
    
    public static char [] sustituir2(char f[]){
        char fmod[] = new char [50];
        for(int i = 0, j = 0; i < f.length; i++, j++){
            if(f[i] == ' '){
                fmod[j] = 'x';
                j++;
            }
                fmod[j] = f[i];
        }
        return fmod;
    }
}
