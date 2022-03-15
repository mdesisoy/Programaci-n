/*Ordenar vectores de una tabla*/
package primera;


public class Ejercicio050 {
    public static void main(String arg[]){
        int salarios[][] = {{700, 900, 1300, 800, 790, 850}, {1000, 950, 1080, 1070, 1200, 1100}, 
                            {1300, 930, 1200, 1170, 1000, 1000}, {1500, 1950, 1880, 1978, 2200, 2100}};
        System.out.printf("La tabla ordenada es: \n");
        for(int i = 0; i < salarios.length; i++)
            ordenar(salarios[i]);
        
        for(int i = 0; i < salarios.length; i++){
            for(int j = 0; j < salarios[i].length; j++)
                System.out.printf(" %d ", salarios[i][j]);
            System.out.println();
        }
    }
    
    public static void ordenar(int sal[]){
        int aux = 0;
        int posMenor;
        for(int j = 0; j < sal.length - 1; j++){
            posMenor = j;
            for(int i = j; i < sal.length; i++)
                if(sal[i] < sal[posMenor])
                    posMenor = i;
                aux = sal[posMenor];
                sal[posMenor] = sal[j];
                sal[j] = aux;
                
        } 
    }
}
