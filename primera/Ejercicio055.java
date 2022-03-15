/*
Tenemos lo mismo que en el ejercicio anterior, pero vamos a cargar el resultado
de las multiplicaciones en una tabla que llamaremos ventas
 */
package primera;


public class Ejercicio055 {
    public static void main(String arg[]){
        int kilos[][] = {{5, 6, 9, 23, 7, 14, 0}, {16, 8, 4, 33, 15, 21, 2}};
        double precios[] = {3.5, 2.2};
        double ventas[][] = {{0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0}}; //new double[2][7];
        
        //Pasando el vector ventas
        multiplicar(kilos, precios, ventas);
        for(int i  = 0; i < ventas.length; i++){
            for(int j = 0; j < ventas[i].length; j++)
                System.out.printf(" %.2f ", ventas[i][j]);
            System.out.println();
        }
        
        //Sin pasar vector ventas
        System.out.println();
        double ventas2[][] = multiplicar2(kilos, precios);
        for(int i  = 0; i < ventas2.length; i++){
            for(int j = 0; j < ventas2[i].length; j++)
                System.out.printf(" %.2f ", ventas2[i][j]);
            System.out.println();
        }
    }
    
    public static void multiplicar(int t[][], double p[], double v[][]){
        for(int i  = 0; i < t.length; i++)
            for(int j = 0; j < t[i].length; j++)
                v[i][j] = t[i][j] * p[i]; 
    }
    
    
    public static double[][] multiplicar2(int t[][], double p[]){
        double v[][] = new double [t.length][t[0].length];
        for(int i  = 0; i < t.length; i++)
            for(int j = 0; j < t[i].length; j++)
                v[i][j] = t[i][j] * p[i]; 
        return v;
    }
}
