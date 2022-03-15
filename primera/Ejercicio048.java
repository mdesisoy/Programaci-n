package primera;


public class Ejercicio048 {
    public static void main(String arg[]){
        int salarios[][] = {{700, 900, 1300, 800, 790, 850}, {1000, 950, 1080, 1070, 1200, 1100}, 
                            {1300, 930, 1200, 1170, 1000, 1000}, {1500, 1950, 1880, 1978, 2200, 2100}};
        String empleados[] = {"Javier Marías", "Antonio Muñoz", "Isabel Allende", "José Saramago"};
        String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio"};
        
        /*salariosSemestrales sera una funcion que me devuelva un vector de 4
        enteros con lo que ha cobrado cada empleado en los seis meses
        salariosMensuales sera una funcion que me devuelva un vector de 6
        enteros con lo que se ha pagado cada mes*/
        int empleadosAcum[] = salariosSemestrales(salarios);
        for(int i = 0; i < empleadosAcum.length; i++)
            System.out.printf("%s ha cobrado %d\n", empleados[i], empleadosAcum[i]); //mostrar vector
        
        int mesAcum[] = salariosMensuales(salarios);
        for(int i = 0; i < mesAcum.length; i++)
            System.out.printf("%s se ha pagado %d\n", meses[i], mesAcum[i]); //mostrar vector
            System.out.println("----------------------------------");
          
        /*OTRO METODO*/
            
        /*salariosSemestrales2 carga el vector emplAcum con lo que ha 
        cobrado cada empleado en los seis meses
        salariosMensuales2 carga el vector mAcum con lo que se ha 
        pagado cada mes*/
        int emplAcum[] = {0, 0, 0, 0};
        salariosSemestrales2(salarios, emplAcum);
        for(int i = 0; i < emplAcum.length; i++)
            System.out.printf("%s ha cobrado %d\n", empleados[i], emplAcum[i]); //mostrar vector
        
        int mAcum[] = {0, 0, 0, 0, 0, 0};
        salariosMensuales2(salarios, mAcum);
        for(int i = 0; i < mAcum.length; i++)
            System.out.printf("%s se ha pagado %d\n", meses[i], mAcum[i]); //mostrar vector
    }
    
    public static int [] salariosSemestrales(int tabla[][]){
        int v[] = new int [tabla.length]; //las filas
        for( int i = 0; i < tabla.length; i++)
            for(int j = 0; j < tabla[i].length; j++)
                v[i] += tabla[i][j];
        return v;
    }  
    
    public static int [] salariosMensuales(int tabla[][]){
        int v[] = new int [tabla[0].length]; //las filas
        for( int i = 0; i < tabla.length; i++)
            for(int j = 0; j < tabla[i].length; j++)
                v[j] += tabla[i][j];
        return v;
    } 
    
    public static void salariosSemestrales2(int tabla[][], int v[]){
        for( int i = 0; i < tabla.length; i++)
            for(int j = 0; j < tabla[i].length; j++)
                v[i] += tabla[i][j];
    } 
    
    public static void salariosMensuales2(int tabla[][], int v[]){
        for( int i = 0; i < tabla.length; i++)
            for(int j = 0; j < tabla[i].length; j++)
                v[j] += tabla[i][j];
    }  
}
