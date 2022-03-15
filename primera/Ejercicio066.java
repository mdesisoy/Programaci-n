/*
Desplazar cada caracter una posicion a la derecha y el ultimo caracter de cada
palabra al inicio de la frase. Lo mismo pero a la izquierda
 */
package primera;


public class Ejercicio066 {
    public static void main(String arg[]){
        char cadena[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r',
                        ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'm', 'a', 'n', 'c', 'h', 'a', ' '};
        int inicio = 0, fin = 0;
        
        /*System.out.println("DESPLAZAR DERECHA");
        desplazarDcha(cadena, inicio, fin);
        System.out.println(cadena);*/
        
        System.out.println("DESPLAZAR IZQUIERDA");
        desplazarIzda(cadena, inicio, fin);
        System.out.println(cadena);
    }
    
    public static void desplazarDcha(char c[], int ini, int fin){
        char aux;
        while(fin < c.length){
            while(c[fin] != ' ')
                fin++;
            aux = c[fin-1];
            for(int i = fin-1; i > ini; i--)
                c[i] = c[i-1]; 
            c[ini] = aux; 
            ini = ++fin; //fin + 1
        }
        
    }
    
    public static void desplazarIzda(char c[], int ini, int fin){
        char aux;
        while(fin < c.length){
            while(c[fin] != ' ')
                fin++;
            aux = c[ini];
            for(int i = ini; i < fin-1; i++)
                c[i] = c[i+1]; 
            c[fin-1] = aux; 
            ini = fin + 1;
            fin++;
        }
        
    }
}
