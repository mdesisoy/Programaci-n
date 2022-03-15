/*
Escribir sobre frase2 el contenido de frase1, pero con los
caracteres invertidos
 */
package primera;


public class Ejercicio085 {
    public static void main(String arg[]){
        String frase1 = "Y si fuera al reves";
        String frase2 = "";
        
        for(int i = frase1.length()-1; i >= 0; i--)
            frase2 = frase2.concat(Character.toString(frase1.charAt(i))); 
            //frase2 += frase1.charAt(i);
        System.out.println(frase2);
    }
}
