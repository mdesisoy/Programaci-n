/*
Mostrar por pantalla el nombre del empleado que más cobra y su salario medio 
mensual y el que menos cobra

Mostrar el mes en que más se cobra y cual es su salario medio y el mes en que 
menos se cobra y cual es su media
*/
package primera;

public class Ejercicio037 {
    public static void main(String arg[]){
        int salarios[][] = {{700, 900, 1300, 800, 790, 850}, {1000, 950, 1080, 1070, 1200, 1100}, 
                            {1300, 930, 1200, 1170, 1000, 1000}, {1500, 1950, 1880, 1978, 2200, 2100}};
        String empleados[] = {"Javier Marías", "Antonio Muñoz", "Isabel Allende", "José Saramago"};
        String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio"};
        int media1 = empleados.length;
        int media2 = meses.length;
        double cuentaEmpleado[] = {0.0, 0.0, 0.0, 0.0};
        double cuentaMes[] = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
        int posMejorEm = 0;
        int posPeorEm = 0;
        int posMejorMes = 0;
        int posPeorMes = 0;
        for(int i = 0; i < salarios.length; i++){
            for(int j = 0; j < salarios[i].length; j++){
                cuentaEmpleado[i] += salarios[i][j];
                cuentaMes[j] += salarios[i][j];
            }
            //Empleados
            if(cuentaEmpleado[i] > cuentaEmpleado[posMejorEm])
                posMejorEm = i;
            if(cuentaEmpleado[i] < cuentaEmpleado[posPeorEm])
                posPeorEm = i;    
        }
        //Meses
        for(int i = 0; i < cuentaMes.length; i++){
            if(cuentaMes[i] > cuentaMes[posMejorMes])
                posMejorMes = i;
            if(cuentaMes[i] < cuentaMes[posPeorMes])
                posPeorMes = i;
        }
        
        System.out.printf("El empleado que mas cobra  es %s con una media de %.2f euros \n", 
        empleados[posMejorEm], cuentaEmpleado[posMejorEm]/media1);
        System.out.printf("El empleado que menos cobra  es %s con una media de %.2f euros \n", 
        empleados[posPeorEm], cuentaEmpleado[posPeorEm]/media1);
        System.out.printf("El mes en el que mas cobra  es %s con una media de %.2f euros \n", 
        meses[posMejorMes], cuentaMes[posMejorMes]/media2);
        System.out.printf("El mes en el que menos cobra  es %s con una media de %.2f euros \n", 
        meses[posPeorMes], cuentaMes[posPeorMes]/media2);
    }
}
