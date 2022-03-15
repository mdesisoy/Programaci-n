/*
intercambia la primera letra por la ultima en cada palabra
 */
package primera;


public class Ejercicio065 {
    public static void main(String arg[]){
        char cadena[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r',
                        ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'm', 'a', 'n', 'c', 'h', 'a', ' '};
        char aux; //variable intercambio
        int inicio = 0;
        int fin = 0;
        for(int i = 0; i < cadena.length; i++)
            if(cadena[i] == ' '){
                fin = i - 1;
                aux = cadena[inicio];
                cadena[inicio] = cadena[fin]; 
                cadena[fin] = aux;
                inicio = i + 1;
            }
        
        System.out.println(cadena);
    }
    
    /*MANERA DE AGUSTÍN
    while(fin < cadena.length){
        while(cadena[fin] != ' ')
            fin++;
        aux = cadena[inicio];
        cadena[inicio] = cadena[fin-1];
        cadena[fin-1] = aux;
        inicio = fin + 1;
        fin++;
        // tambien se puede poner como inicio = ++fin;
    }
    System.out.println(cadena);
    */
}
