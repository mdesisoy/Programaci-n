/*
Intercambiar palabras de las dos frases para crear una entera
 */
package primera;


public class Ejercicio084 {
    public static void main(String arg[]){
        String frase1 = "Habia vez circo alegraba el ";
        String frase2 = "una un que siempre corazón xd ";
        String frase3 = "";
        
        int inicio1 = 0, inicio2 = 0;
        int fin1 = frase1.indexOf(" "), fin2 = frase2.indexOf(" ");
        while(fin1 != -1 || fin2 != -1){
                //primera frase
                if(fin1 != -1){
                    frase3 = frase3.concat(frase1.substring(inicio1, fin1+1));
                    inicio1 = fin1 + 1;
                    fin1 = frase1.indexOf(" ", fin1+1);  
                }
                //segunda frase
                if(fin2 != -1){
                    frase3 = frase3.concat(frase2.substring(inicio2, fin2+1));
                    inicio2 = fin2 + 1;
                    fin2 = frase2.indexOf(" ", fin2+1);   
                }
        }
        System.out.println(frase3);
    }
}
