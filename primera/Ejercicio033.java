/*
Mostrar la película más taquillera y cuantas entradas ha vendido, y la menos 
taquillera
*/
package primera;

public class Ejercicio033 {
    public static void main(String arg[]){
        int entradas[][] = {{10,20,10,10,24,12,17},{100,120,320,300,140,350,31},{10,15,23,30,21,350,19},{10,21,37,15,15,400,32}};
        String pelis [] = {"Spider-man", "Venon", "Dune", "James Bond"};
        int cuenta[] = {0,0,0,0}; //acumulacion de entradas peli 
        int posMax = 0;
        int posMin = 0;
        for(int i = 0; i < entradas.length; i++) //4 filas
            for(int j = 0; j < entradas[i].length; j++) //7 columnas
                cuenta[i] += entradas[i][j];
        for(int i = 1; i < cuenta.length; i++){
            if(cuenta[i] > cuenta[posMax])
                posMax = i;
            if (cuenta[i] < cuenta[posMin])
                posMin = i;
        }
        System.out.printf("La peli que más vende es %s con %d entradas vendidas \n", pelis[posMax], cuenta[posMax]);
        System.out.printf("La peli que menos vende es %s con %d entradas vendidas\n", pelis[posMin], cuenta[posMin]);
    } 
}
