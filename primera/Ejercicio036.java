/*
Listado de alumnos con un 10 en una asignatura
*/
package primera;


public class Ejercicio036 {
    public static void main(String arg[]){
        int notas[][] = {{7, 9, 3, 8}, {10, 9, 9, 8}, {9, 10, 7, 1}, {3, 10, 5, 6}, {8, 5, 4, 5}};
        String alumnos[] = {"Javier Marías", "Antonio Muñoz", "Isabel Allende", "José Saramago", "Pietro Pierce"};
        String asignaturas[] = {"Programación", "Lenguaje de Marcas", "Sistemas", "Bases de Datos"}; 
        System.out.println("Listado de DIECES: ");
        for(int i = 0; i < notas.length; i++)
            for(int j = 0; j < notas[i].length; j++)
                if(notas[i][j] == 10)
                    System.out.printf("El alumno %s tiene un 10 es la asignatura %s \n", alumnos[i], asignaturas[j]);
    }  
}
