/*
Sacar el maximo y el minimo de toda la tabla, maxima asistencia, en que dia y 
que peli y lo mismo con el minimo
*/
package primera;


public class Ejercicio034 {
    public static void main(String arg[]){
        int entradas[][] = {{10,20,10,10,5,12,17},{100,120,320,300,140,350,31},{10,15,23,30,21,350,19},{10,21,37,15,15,400,32}};
        String pelis [] = {"Spider-man", "Venom", "Dune", "James Bond"};
        String semana [] = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
        int posMaxi = 0;
        int posMaxj = 0;
        int posMini = 0;
        int posMinj = 0;
        for(int i = 0; i < entradas.length; i++){ //4 filas
            for(int j = 0; j < entradas[i].length; j++){ //7 columnas
                if(entradas[i][j] > entradas[posMaxi][posMaxj]){
                    posMaxi = i;
                    posMaxj = j;
                }    
                if (entradas[i][j] < entradas[posMini][posMinj]){
                    posMini = i;
                    posMinj = j;
                }
            }
        }
        System.out.printf("La maxima asistencia es %d el dia %s con la peli %s\n", entradas[posMaxi][posMaxj], 
        semana[posMaxj], pelis[posMaxi]);
        System.out.printf("La minima asistencia es %d el dia %s con la peli %s\n", entradas[posMini][posMinj], 
        semana[posMinj], pelis[posMini]);    
    }      
}
