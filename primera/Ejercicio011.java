package primera;

public class Ejercicio011 {
    public static void main(String arg[]){
        int x, y, resultado;
        x = 7;
        y = 4;
        resultado = 0;
        for(int i = 0; i < y ; i++) //y es el numero de veces que sumas x
            resultado += x;
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
}
