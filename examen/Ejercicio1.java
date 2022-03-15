/*
Dada una cadena de caracteres cuyas palabras están separadas por un espacio en 
blanco, cambiar a mayúsculas las palabras cuya longitud sea superior a 3 
caracteres.
a) Hacerlo sobre la propia cadena.
b) Hacerlo sobre una nueva cadena.
 */
package examen;

public class Ejercicio1 {
    public static void main(String arg[]){
        char cadena[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r',' '};
        int longitud = 0;
        int inicio = 0;
        int fin = 0;
        masDeTresAMayusc(cadena, longitud, inicio, fin);
        System.out.println(cadena);
        char cadena2[] = new char[cadena.length];
        cadena2 = masDeTresAMayusc2(cadena, cadena2, longitud, inicio, fin);
        System.out.println(cadena2);
    }
    
    public static void masDeTresAMayusc(char cadena[], int longitud, int inicio, int fin){
        for (int i = 0; i < cadena.length; i++){
            if(cadena[i] == ' '){
                fin = i;
                for(int j = inicio; j < fin; j++){
                    longitud++;
                }
                if(longitud > 3){
                    for(int k = inicio; k < fin; k++){
                        cadena[k] = Character.toUpperCase(cadena[k]);
                    inicio = fin + 1;
                    longitud = 0;
                    }
                }else{
                    i++;
                }
            }
            else{ 
                i++; 
            }
        }
    }
    
    
    //DEVUELVE LA CADENA
    public static char[] masDeTresAMayusc2(char cadena[], char cadena2[], int longitud, int inicio, int fin){
        for (int i = 0; i < cadena.length; i++){
            if(cadena[i] == ' '){
                fin = i;
                for(int j = inicio; j < fin; j++){
                    longitud++;
                }
                if(longitud > 3){
                    for(int k = inicio; k < fin; k++){
                        cadena2[k] = Character.toUpperCase(cadena[k]);
                    inicio = fin + 1;
                    longitud = 0;
                    }
                }else{
                    cadena2[i]= cadena[i++];
                }
            }
            else{ 
                cadena2[i]= cadena[i++]; 
            }
        }
        return cadena2;
    }
}
