/*
Mostrar por pantalla cuanto vale cada producto
 */
package primera;


public class Ejercicio031 {
        public static void main(String arg[]){
        int tabla[][] = {{10, 20, 30, 40, 25}, {50, 60, 70, 80, 27}, {90, 100, 110, 120, 50}};
        String productos[] = {"Naranjas", "Peras", "Melones"};
        double precio[] = {1.5, 2.08, 0.8}; //precio kilo
        double acum; 
        double total = 0.0; //para total de precios
        for(int i = 0; i < tabla.length; i++){ //filas
            acum = 0.0;
            for(int j = 0; j < tabla[i].length; j++)
                acum += (tabla[i][j]*precio[i]);
            System.out.printf("Vendidos %.2f € de %s\n", acum, productos[i]);
            total += acum;
            
        }
        System.out.println("---------------------------");
        System.out.printf("En total ha recaudado %.2f €\n", total);
    }
}

