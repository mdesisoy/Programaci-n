/*
Mostrar por pantalla el numero de veces que aparecerá el caracter 'a' en un 
vector de strings
 */
package primera;


public class Ejercicio080 {
    public static void main(String arg[]){
        String nombres[] = {"En un lugar", "de la Mancha", "donde se", "opina mucho"};
        int contador = 0;
        int cont = 0; //contador para la forma charAt
        int pos = 0;
        
        //CON INDEXOF
        for(int i = 0; i < nombres.length; i++){
            pos = nombres[i].indexOf('a',pos);
            while (pos != -1){
                contador++;
                pos = nombres[i].indexOf('a',pos+1);
            }
        }
        System.out.printf("Se ha encontrado %d veces (con indexOf)\n", contador);
        
        //CON CHARAT
        for(int i = 0; i < nombres.length; i++)
            for(int j = 0; j < nombres[i].length(); j++)
                if (nombres[i].charAt(j) == 'a')
                    cont++;
        System.out.println("----------------------------");
        System.out.printf("Se ha encontrado %d veces (con charAt)\n", cont);
    }
}
