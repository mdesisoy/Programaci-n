package Ejercicio04;

public class Resultado {
    public static void main (String arg[]){
        Bombo bombo1 = new Bombo();
        int tabla[][] = new int[6][8];
        for (int i = 0; i < tabla.length; i++){ 
            for (int j = 0; j < tabla[i].length; j++){
                tabla[i][j] = bombo1.sacar();
                System.out.printf("%d ", tabla[i][j]);
            }
            System.out.println();
        }
    }
}
