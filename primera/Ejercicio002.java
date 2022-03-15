package primera;

public class Ejercicio002 {
    public static void main(String arg[]){
        int x, y;
        x = 65;
        y = 44;
        if(x > y) //no necesita llaves si una sola instruccion
            System.out.println("El mayor es: " + x);
        else
            System.out.println("El mayor es: " +  y);
        System.out.println("Adios");
    }
}
