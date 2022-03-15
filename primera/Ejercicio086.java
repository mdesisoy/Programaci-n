/*
Añadir al final de cada palabra una a
 */
package primera;


public class Ejercicio086 {
    public static void main(String arg[]){
        String frase1 = "Y si fuera al reves ";
        String frase2 = "";
        
        int inicio = 0;
        int fin = frase1.indexOf(" ");
        while(fin != -1){
            frase2 = frase2.concat(frase1.substring(inicio, fin).concat("a").concat(" "));
            inicio = fin + 1;
            fin = frase1.indexOf(" ", inicio);
        }
        System.out.println(frase2);
    }
    
    /*FORMA AGUSTÍN CON UNA SOLA FRASE
    int pos = frase.indexOf(" ");
        while(pos != -1){
            frase = frase.substring(0, pos).concat("a").concat(frase.substring(pos));
            pos = frase.indexOf(" ", pos + 2);
        }
        System.out.println(frase);*/
}