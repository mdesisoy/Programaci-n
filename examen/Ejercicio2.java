/*
El mismo ejercicio anterior, pero en lugar de tratar con una cadena de 
caracteres, hacerlo con un String.  Sobre el mismo String. 
 */
package examen;


public class Ejercicio2 {
    public static void main(String arg[]){
        String cadena = "En un lugar";
        int inicio = 0;
        int fin = cadena.indexOf(" ");
        System.out.println(fin);
        int cont = 0;
        String sub = "";
        
        
            while(fin != -1){
                sub = cadena.substring(inicio, fin);
                for(int j = 0; j<sub.length();j++)
                    cont++;
                if(cont > 3){
                    cadena = cadena.replace(sub,sub.toUpperCase()).concat(cadena.substring(fin+1));
                    inicio = fin + 1;
                    fin = cadena.indexOf(" ", fin+1);
                }
                else{
                    inicio = fin + 1;
                    fin = cadena.indexOf(" ", fin+1);
                }
            }
            System.out.println(cadena);
    } 
}
