/*
Eliminar de una cadena de caracteres todas las veces que se repite una subcadena.
Sin utilizar una cadena de caracterres auxiliar
 */
package primera;


public class Ejercicio073 {
    public static void main(String arg[]){
        char cadena[] = {'e', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r',
                        ' ', 'e', 'n', ' ', 'l', 'a', ' ', 'm', 'a', 'n', 'c', 'h', 'a'};
        char subcadena[] = {'e', 'n', ' '};
        
        for(int i = 0; i < cadena.length; i++)
            if(cadena[i] == subcadena[0]){
                int j = 1;
                while(j < subcadena.length && subcadena[j] == cadena[i+j])
                    j++;
                if(j == subcadena.length)
                    for(int z = 0; z < subcadena.length; z++){
                        for (int x = i; x < cadena. length - 1; x++)
                            cadena[x] = cadena[x+1]; 
                        cadena[cadena.length - 1] = ' ';
                    }
            }   
            
        System.out.println(cadena);
    }
}
