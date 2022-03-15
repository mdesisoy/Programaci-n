/*
Invertir cada palabra
 */
package primera;

public class Ejercicio071 {
    public static void main(String arg[]){
        char cadena[] = {' ', 'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r',
                        ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'm', 'a', 'n', 'c', 'h', 'a'};
        char frase2[] = new char[150];
        int inicio = cadena.length - 1;
        int fin = inicio;
        int pos = 0; //indice para recorrer frase2
        
        while(inicio > 0){
            while(cadena[inicio] != ' ')
                inicio--;
            for(int i = inicio; i <= fin; i++, pos++)
                frase2[pos] = cadena[i];
            fin = inicio = inicio -1;
        }
        System.out.println(frase2);
    }
    
}    
    /*MANERA 2
    for(int i = cadena.length - 1; i > 0; i--){
            if(cadena[i] == ' '){
                inicio = i + 1;
                for(int j = inicio; j <= fin; j++){
                    aux = cadena[j];
                    cadena[j] = cadena[fin - j]; 
                    cadena[fin - j] = aux;
                }
                fin = inicio - 2; 
            } 
        }
    */



