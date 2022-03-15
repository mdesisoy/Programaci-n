/*
Limpiar las frases para que entre cada palabra haya solo un espacio en blanco
 */
package primera;


public class Ejercicio087 {
    public static void main(String arg[]){
        String frase = "Y    si     fuera     al      reves ";
        
        /* FUNCIÓN REPLACEALL
        frase = frase.replaceAll(" +", " ");
        //" +" todos los espacios es blanco
        System.out.println(frase);*/
        
        boolean primero = true;
        int i = 0;
        while(i < frase.length())
            if(frase.charAt(i) == ' '){
                if(primero){
                    primero = false;
                    i++;
                }else{
                    frase = frase.substring(0,i).concat(frase.substring(i+1));
                }
            }
            else{
                i++;
                primero = true;
            }
        System.out.println(frase);           
                    
        
        /*int fin = frase.indexOf(" ");
        while(fin != -1){
            frase = frase.substring(0, fin);
            String com = Character.toString(frase.charAt(fin+1));
            while ( com == " ")
                frase = frase.concat(frase.substring(fin + 1));
            //fin = frase.indexOf(" ", fin);
        }
        System.out.println(frase);*/
    }
}
