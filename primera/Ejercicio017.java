/*
Invertir contenido elementos del vector
*/
package primera;

public class Ejercicio017 {
    public static void main(String arg[]){
        int datos[] = {-10, -57, -109, -2, -88};
        int aux;
        for(int i = 0; i < (datos.length/2); i++){
            //Se divide entre dos para permutar mitad y mitad de vector
            aux = datos[i];
            datos[i] = datos[(datos.length-1)-i]; //-1 porque vector desde 0
            datos[(datos.length-1)-i] = aux;
        }
        System.out.print("El vector es: ");
        for(int i = 0; i < datos.length; i++)
            System.out.printf("%d ", datos[i]);
    }   
}