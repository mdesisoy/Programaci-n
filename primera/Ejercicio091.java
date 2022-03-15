/*
Muestrame el camino de ida y vuelta
 */
package primera;


public class Ejercicio091 {
    public static void main(String arg[]){
        int n = 5;
        mostrarFrase(n);
    }
    public static void mostrarFrase(int a){
        if(a > 0){
            System.out.println("mostrarFrase(" + a + ")");
            mostrarFrase(a-1);
            System.out.println("mostrarFrase(" + a + ")");
        }
    }
}
