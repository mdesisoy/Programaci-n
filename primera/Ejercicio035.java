/*
Que alumno ha obtenido las mejores notas y cual es su media
Por otra parte mostrar por pantalla que asignatura tiene las mejores notas y
su media y cual tiene las peores y su media
*/
package primera;


public class Ejercicio035 {
    public static void main(String arg[]){
        int notas[][] = {{7, 9, 3, 8}, {10, 9, 9, 8}, {9, 10, 7, 1}, {3, 10, 5, 6}, {8, 5, 4, 5}};
        String alumnos[] = {"Javier Marías", "Antonio Muñoz", "Isabel Allende", "José Saramago", "Pietro Pierce"};
        String asignaturas[] = {"Programación", "Lenguaje de Marcas", "Sistemas", "Bases de Datos"};
        int media1 = asignaturas.length;
        int media2 = alumnos.length;
        double cuentaAlum[] = {0.0, 0.0, 0.0, 0.0, 0.0}; //Suma nota por alumnos
        double cuentaAsig[] = {0.0, 0.0, 0.0, 0.0}; //Suma nota por asignaturas
        int posMejorAlum = 0;
        int posPeorAlum = 0;
        int posMejorAsig = 0;
        int posPeorAsig = 0;
        for(int i = 0; i < notas.length; i++){
            for(int j = 0; j < notas[i].length; j++){
                cuentaAlum[i] += notas[i][j];
                cuentaAsig[j] += notas[i][j];
            }
            //Alumnos
            if(cuentaAlum[i] > cuentaAlum[posMejorAlum])
                posMejorAlum = i;
            if(cuentaAlum[i] < cuentaAlum[posPeorAlum])
                posPeorAlum = i;
            
        }
        //Asignaturas
        for(int i = 0; i < cuentaAsig.length; i++){
            if(cuentaAsig[i] > cuentaAsig[posMejorAsig])
                posMejorAsig = i;
            if(cuentaAlum[i] < cuentaAlum[posPeorAsig])
                posPeorAsig = i;
        }
        System.out.printf("El alumno con mejores notas es %s con una media de %.2f \n", 
        alumnos[posMejorAlum], cuentaAlum[posMejorAlum]/media1);
        System.out.printf("El alumno con peores notas es %s con una media de %.2f \n", 
        alumnos[posPeorAlum], cuentaAlum[posPeorAlum]/media1);
        System.out.printf("La asignatura con mejores notas es %s con una media de %.2f \n", 
        asignaturas[posMejorAsig], cuentaAsig[posMejorAsig]/media2);
        System.out.printf("La asignatura con peores notas es %s con una media de %.2f \n", 
        asignaturas[posPeorAsig], cuentaAsig[posPeorAsig]/media2);
    }
}
