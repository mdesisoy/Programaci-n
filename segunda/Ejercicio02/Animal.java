package Ejercicio02;

abstract class Animal { //esta clase es abstracta, no se pueden crear objetos de esta clase
    int id;
    String fechaNacimiento;
    private String nombre; //Atributo encapsulado
    boolean vacunado;
    
    //getters y setters para poder acceder a atributos encapsulados
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String n){
        nombre = n;
    }
    
    //constructor
    public Animal(int id, String fnac, String nom, boolean vacun){
        this.id = id;
        fechaNacimiento = fnac;
        nombre = nom;
        vacunado = vacun;
    }   
    //las subclases de Animal, estarán obligadas a implementar el metodo mostrar
    //ya que el metodo esta declarado como abstract
    abstract void mostrar();
}
