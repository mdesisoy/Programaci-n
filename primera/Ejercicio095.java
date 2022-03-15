/*
Pasar un número decimal a binario
 */
package primera;


public class Ejercicio095 {
    public static void main(String[] args){
        System.out.println("CON RECURSIVIDAD Y BACKTRACKING");
        int num = 9;
        aBinario(num);
        System.out.println();
    }
    //RECURSIVA
    public static void aBinario(int num){
        if (num > 0){ //if(x != 0)
            aBinario(num / 2); //dividir hasta el último número o caso base
            //para sacarlo hacia detrás
            System.out.print((num % 2) + " "); //mostrar el resto de la division
        }
    }
}
