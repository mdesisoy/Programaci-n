/*
Tenemos un string con una frase, repartir la frase alternativamente una 
palabra en casa string
 */
package primera;


public class Ejercicio088 {
    public static void main(String arg[]){
        String frase = "Hola que tal estas? ";
        String fraseA = "";
        String fraseB = "";
        
        int inicio = 0;
        int fin = frase.indexOf(" ");
        boolean queFrase = true;
        while(fin != -1 ){
            if(queFrase){
                fraseA = fraseA.concat(frase.substring(inicio, fin+1));
                queFrase = false;
            }
            else{
                fraseB = fraseB.concat(frase.substring(inicio, fin+1));
                queFrase = true;   
            }
            inicio = fin + 1;
            fin = frase.indexOf(" ", inicio);
        }
        System.out.printf(" %s \n %s \n", fraseA, fraseB);
    }
}
