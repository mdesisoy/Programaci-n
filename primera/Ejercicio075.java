/*
Cambiar de la cadena, las vocales que están en mayúscula por minúscula y 
viceversa y el resto de los caracteres se sustituyen por '$'
 */
package primera;


public class Ejercicio075 {
    public static void main(String arg[]){
        char cadena[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r',
                            ' ', 'e', 'n', ' ', 'l', 'a', ' ', 'm', 'a', 'n', 'c', 'h', 'a', ' '};
        //usar switch

        for(int i = 0; i < cadena.length; i++)
            switch(cadena[i]){
                case 'a': case 'e': case 'i': case 'o': case 'u': 
                //se pueden poner los case todos seguidos si hacen lo mismo
                    cadena[i] = Character.toUpperCase(cadena[i]);
                    break;
                case 'A': case 'E': case 'I': case 'O': case 'U':
                    cadena[i] = Character.toLowerCase(cadena[i]);
                    break;
                default:
                    cadena[i] = '$';
            }
                
        
        System.out.println(cadena);
    }
}
