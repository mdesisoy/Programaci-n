/*
Tenemos un array bidimensional en el que se guardan el numero de entradas
vendidas en las cuatro salas de cine del ccentro comercial, cada dia de la 
semana.
Mostrar por pantalla el dia que mas entradas se vendieron y el que menos
*/
package primera;


public class Ejercicio032 {
    public static void main(String arg[]){
        int entradas[][] = {{10,20,15,10,24,120,17},{10,12,32,30,14,350,31},{10,15,23,30,21,350,19},{10,21,37,15,15,400,32}};
        String semana [] = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
        int cuenta[] = {0,0,0,0,0,0,0}; //acumulacion de entradas por dia
        int posMax = 0;
        int posMin = 0;
        for(int i = 0; i < entradas.length; i++){ //4 filas
            for(int j = 0; j < entradas[i].length; j++) //7 columnas
                cuenta[j] += entradas[i][j];
        }
        for(int i = 1; i < cuenta.length; i++){
            if(cuenta[i] > cuenta[posMax])
                posMax = i;
            if (cuenta[i] < cuenta[posMin])
                posMin = i;
        }
        System.out.printf("El dia que mas vende es el %s con %d entradas \n", semana[posMax], cuenta[posMax]);
        System.out.printf("El dia que menos vende es el %s con %d entradas \n", semana[posMin], cuenta[posMin]);
    }
}