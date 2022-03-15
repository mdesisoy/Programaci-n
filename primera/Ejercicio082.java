/*
Quitar todos los espacios del String sin usar replace
 */
package primera;


public class Ejercicio082 {
    public static void main(String arg[]){
        String frase = "En un lugar de La Mancha";
        
        int pos = frase.indexOf(" ");
        while(pos != -1){
            frase = frase.substring(0,pos).concat(frase.substring(pos+1));
            //siempre empieza en cero porque coges cada palabra 
            //desde el principio
            pos = frase.indexOf(" ");
        }
        System.out.println(frase);
    }
}
