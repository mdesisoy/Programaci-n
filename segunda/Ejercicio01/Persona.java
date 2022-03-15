package Ejercicio01;


public class Persona {
    //atributos, variables globales 
    //se pueden utilizar en cualquier metodo
    private String nombre; //solo puede usarse aqui, no fuera de esta clase
    public String apellido;
    public double altura;
    public double peso;
    
    //constructor, no devuelven nada
    public Persona(){
        nombre = "Rodrigo";
        apellido = "Diaz";
        altura = 1.87;
        peso = 90;
    }
    public Persona(String nom, String ape){ //le puedes pasar los datos
        nombre = nom;
        apellido = ape;
        altura = 1.70;
        peso = 62;
    }
    
    //constructor normalmente uaado
    public Persona(String nom, String ape, double alt, double peso){
        nombre = nom;
        apellido = ape;
        altura = alt;
        this.peso = peso; //this -> este es el objeto sobre el que estamos actuando
                          //lo usamos en casos de ambigüedad
    }
    public void mostrar(){
        System.out.println(apellido + " (" + altura + 
                           ") - (" + peso + ")");
    }
}
