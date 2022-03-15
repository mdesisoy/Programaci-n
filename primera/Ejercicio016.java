/*
Sacar mayor y menor del vector, también con la posicion
*/
package primera;

public class Ejercicio016 {
    public static void main(String arg[]){
        int datos[] = {-10, -57, -109, -2, -88};
        int mayor = datos[0];
        int menor = datos[0];
        int posicionMax = 0;
        int posicionMin = 0;
        //para segunda parte usando solo variable posicion
        int posMax = 0;
        int posMin = 0;
        for(int i = 1; i < datos.length; i++){
            if(mayor < datos[i]){
                mayor = datos[i];
                posicionMax = i;
            }
            if (menor > datos[i]){
                menor = datos[i];
                posicionMin = i;
            }
        }
        System.out.printf("El dato mayor es %d en posicion %d y el dato menor es %d en posicion %d\n", 
        mayor, posicionMax, menor, posicionMin);
        
        //usando variable posicion
        for(int i =1; i < datos.length; i++){
            if(datos[i] > datos[posMax])
                posMax = i;
            if (datos[i] < datos[posMin])
                posMin = i;
        }
        System.out.printf("Valor max en posicion %d y es %d \nValor min en posicion %d y es %d \n", 
        posMax, datos[posMax], posMin, datos[posMin]);
    }
}
