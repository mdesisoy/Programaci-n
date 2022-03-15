/*
Poner de cada palabra de la cadena, la primera y última letra en mayúscula
 */
package primera;


public class Ejercicio074 {
    public static void main(String arg[]){
        char cadena[] = {'e', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r',
                        ' ', 'e', 'n', ' ', 'l', 'a', ' ', 'm', 'a', 'n', 'c', 'h', 'a', ' '};
        int inicio = 0, fin = 0;
        
        for(int i = 0; i < cadena.length; i++)
            if(cadena[i] == ' '){
                fin = i-1;
                cadena[inicio] = Character.toUpperCase(cadena[inicio]); 
                cadena[fin] = Character.toUpperCase(cadena[fin]);
                inicio = fin + 2;
            }
        System.out.println(cadena);
    }
}


/*FORMA AGUSTIN
while(fin < cadena.length){
    while(cadena[fin] != ' ')
        fin++;
    cadena[inicio] = Character.toUpperCase(cadena[inicio]); 
    cadena[fin] = Character.toUpperCase(cadena[fin]);
    inicio = ++fin;
}

*/
