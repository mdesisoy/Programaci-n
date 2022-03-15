/*
Dado un numero entero que se encuentra dentro de una variable, diseccionarlo,
analizándolo hasta las centenas de millar
 */
package primera;


public class Ejercicio094 {
    public static void main(String[] args){
    int var = 785;
    String medidas[] = {"Unidades", "Decenas", "Centenas", "Unidaes de millar", "Decenas de millar", "Centenas de millar"};
    int i = 0;
    while (var > 0){
        System.out.println((var%10) + " "+ medidas[i]);
        var = var/10;
        i++;
    }

    System.out.println("CON RECURSIVIDAD Y BACKTRACKING");
    var = 785;
    diseccionar(var, medidas,0);
}


    //RECURSIVA
    public static void diseccionar(int num, String medidas[], int i){
        if (num > 0){
            diseccionar(num / 10,medidas, i+1);
            //para sacarlo hacia detrás
            System.out.println((num % 10) + " "+ medidas[i]);
        }
    }
}
