/*
Sustuir las ocurrencias de sub1 por sub2 usando cadena auxiliar
 */
package primera;


public class Ejercicio070 {
    public static void main(String arg[]){
        char cadena[] = {'e', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r',
                        ' ', 'e', 'n', ' ', 'l', 'a', ' ', 'm', 'a', 'n', 'c', 'h', 'a', ' '};
        char subcadena1[] = {'e', 'n'};
        char subcadena2[] = {'X', 'X', 'X', 'X', 'X'};
        char frase2[] = new char[150];
        
        //primero buscar la cadena dentro de la frase
        for(int i = 0, j = 0; i < cadena.length; i++){ //la j sirve para recorrer frase2
            if(cadena[i] == subcadena1[0]){
                //se debe poner primero el length para que no se bugee por tener
                //a falso subcadena = cadena
                int indSub = 1;
                while(indSub < subcadena1.length && subcadena1[indSub] == cadena[i+indSub]) //para no salise del bucle 
                    indSub++;
                if(indSub == subcadena1.length)
                    for(int x = 0; x < subcadena2.length; x++){ //escribir subcadena2 en vector
                        frase2[j++] = subcadena2[x];
                    } 
                    i += subcadena1.length-1;
            }
            else{
                frase2[j] = cadena[i];
                j++;
            }
        }
        System.out.println(frase2);
    }
}
