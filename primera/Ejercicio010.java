package primera;


public class Ejercicio010 {
    public static void main(String arg[]){
        int num = 5;
        int resultado = 1;
        for(int i = num; i >= 1; i--)  //Bucle descendente
            resultado *= i; //resultado = resultado * i;
        System.out.println("El factorial de " + num + " es: " + resultado);
        
        resultado = 1;
        for(int i = 1; i <= num; i++) //Bucle ascendente
            resultado *= i; //resultado = resultado * i;
        System.out.println("El factorial de " + num + " es: " + resultado);
        
        /*otra forma
        resultado = num;
        for(int i = num - 1; i >= 1; i--)
        */
    }
}