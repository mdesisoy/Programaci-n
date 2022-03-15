package Ejercicio02;

//concepto herencia
public class Perro extends Animal{ //la clase perro es subclase de clase Animal
    private String raza;
    boolean peligrosidad;
    
    //getters y setters
    public String getRaza(){
        return raza;
    }
    public void setRaza(String r){
        raza = r;
    }
    //constructor
    public Perro(int id, String fnac, String nom, boolean vacun, String raza, boolean p){
        //Primero llamamos al metodo constructor de la superclase
        super(id,fnac,nom,vacun);
        //Segundo objetos de la subclase
        this.raza = raza;
        peligrosidad = p;
    }
    public void mostrar(){
        if(peligrosidad)
            System.out.printf("Hola soy un perro y me llamo %s, soy de la raza %s y "
                             + "naci en %s ¡Soy un aput abomba! Soy peligroso: guau guau! \n", 
                             getNombre(), raza, fechaNacimiento);
                             //aqui raza se pone asi porque es un atributo de la propia clase, no
                             //necesita el get. Si lo usas desde fuera de la clase si necesitas get
        else
            System.out.printf("Hola soy un perro y me llamo %s, soy de la raza %s y "
                             + "naci en %s: guau guau! \n", getNombre(), raza, fechaNacimiento);
    }
}
