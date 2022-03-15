package primera;

public class Ejercicio012 {
    public static void main(String arg[]){
        int x = 5; //5*4*3*2*1
        int y = 2; //2*1
        //Podemos hacer un solo bucle teniendo el cuenta que en la división
        //coincide el factorial de y con parte de x
        int resultado = 1;
        for(int i = x; i > y; i--) 
        //De esta manera no hace falta dividir factoriales
            resultado *= i;
        System.out.println("Variaciones de " + x + " elementos tomados de " + y + 
        " en " + y + " es " + resultado);
        System.out.printf("Variaciones de %d elementos tomados de %d en %d es %d \n", x, y, y, resultado);
    }
}

/* Otra forma peor
      int x = 5;
        int y = 2;
        int resul1 = 1;
        int resul2 = 1;
        for(int i = 1; i <= x; i++)
            resul1 *= i;
        for(int i = 1; i <= y; i++)
            resul2 *= i;
        System.out.println("Variaciones de " + x + " elementos sacados de " + y + 
        " en " + y + " es " + (resul1/resul2));
    }
}
*/