/*
Ordenar las palabras en orden alfabético
 */
package primera;


public class Ejercicio083 {     
    public static void main(String arg[]){
        String frase = "5Cinco 6Seis 2Dos 4Cuatro 1Uno 3Tres ";
        int cont = 0;
        int pos = frase.indexOf(" ");
        
        //SACAR NUMERO DE PALABRAS
        while(pos != -1){
            cont++;
            pos = frase.indexOf(" ",pos+1);
        }
        String v[] = new String [cont]; 
        
        //METER STRING EN EL VECTOR
        int inicio = 0;
        int fin = frase.indexOf(" ");
        for(int i = inicio; i < fin; i++){          // while(fin != -1)
            v[i] = frase.substring(inicio, fin+1);  //v[i] = frase.substring(inicio, fin+1)
            inicio = fin + 1;                       //inicio = fin + 1
            fin = frase.indexOf(" ", fin+1);        //fin = frase.indexOf(" ", fin+1)
                                                    //i++;
        }
        
        //ORDENAR VECTOR
        String aux;
        int menor;
        for(int j = 0; j < v.length - 1; j++)
            for(int i = v.length-1; i > j; i--){
                menor = i-1;
                if (v[i].compareTo(v[menor]) < 0){
                    aux = v[i];
                    v[i] = v[menor];
                    v[menor] = aux;
                }
            }
        
        //METER VECTOR EN EL STRING
        frase = "";
        for(int i = 0; i < v.length; i++)    
            frase = frase.concat(v[i]); //se`puede usar +=
        System.out.println(frase);
    }
}
