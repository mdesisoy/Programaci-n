package Ejercicio01;

public class Programa {
    public static void main(String arg[]){
        Persona persona1, persona2, persona3;
        persona1 = new Persona("Antonio", "Garcia"); //llamando al segundo metodo constructor
        persona2 = new Persona(); //lamando al primer metodo constructor
        persona3 = new Persona("Denis Damiano", "Costello", 1.91, 87); 
        
        //puedo usar persona2  = persona1; hacemos que sea lo mismo
        
        System.out.println(persona1.apellido);
        System.out.println(persona1.altura);
        System.out.println(persona1.peso);
        System.out.println(persona2.apellido + " (" + persona2.altura + 
                           ") - (" + persona2.peso + ")");
        System.out.println(persona3.apellido + " (" + persona3.altura + 
                           ") - (" + persona3.peso + ")");
        //no puedo usar la variable nombre ya que es privada y no puede usarse 
        //fuera de la clase en otros programas
        
        //usando metodo mostrar
        persona1.mostrar();
    }
}
