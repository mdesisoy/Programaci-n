/*
Ssustituir una subcadena por otra (replace)
Buscar una subcadena dentro de otra (indexOf)
 */
package primera;


public class Ejercicio079 {
    public static void main(String arg[]){
        String frase = "En un lugar de La Mancha";
        
        //SUSTITUIR
        frase = frase.replace('a', 'X');
        System.out.println(frase);
        
        frase = frase.replace("lugXr", "sitio");
        System.out.println(frase);
        
        //BUSCAR
        int i = frase.indexOf("sitio"); 
        //devuelve la posicion en la que se encuentra
        System.out.println(i);
        
        int posicion = frase.indexOf("sitio",10);
        System.out.println(posicion); //si no lo encuentra devuelve -1
        
        //------------------------------------------------------------
        
        String frase2 = "En un lugar lugar de la Mancha";
        
        //BUSCAR
        int contador = 0;
        int pos = frase2.indexOf("lugar");
        while (pos != -1){
            contador++;
            pos = frase2.indexOf("lugar",pos+1);
        }
        System.out.printf("Se ha encontrado %d veces\n", contador);
    }
}
