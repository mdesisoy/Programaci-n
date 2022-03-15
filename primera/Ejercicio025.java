package primera;


public class Ejercicio025 {
    public static void main(String arg[]){
        for(int i = 1;i < 11;i++){
            System.out.printf("Tabla de multiplicar del %d: \n", i);
            for(int j = 0; j < 11; j++)
                System.out.printf("%d * %d = %d \n", i, j, i*j);
            System.out.println();
        }        
    }
}
