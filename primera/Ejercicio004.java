package primera;

public class Ejercicio004 {
    public static void main(String arg[]){
        int x, y, z;
        x = 75;
        y = 105;
        z = 200;
        if (x > y && x > z)
            System.out.println("El mayor de los 3 es x y vale: " + x);
        else if(y > x && y > z)
            System.out.println("El mayor de los 3 es y y vale: " + y);
        else
            System.out.println("El mayor de los 3 es z y vale: " + z);
    }
}
        /*if(x > y)
            if(x > z)
                System.out.println("Es x")
            else
                System.out.println("Es z")
          else
            if(y > z)
                System.out.println("Es y")
            else
                System.out.println("Es z")
        */