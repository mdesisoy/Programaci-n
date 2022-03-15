package Ejercicio02;

public class Canguro extends Animal{
    int salto;
    int velocidad;
    
    public Canguro(int id, String fnac, String nom, boolean vacun, int salto, int vel){
        super(id,fnac,nom,vacun);
        this.salto = salto;
        velocidad = vel;
    }
    public void mostrar(){
        System.out.printf("Hola soy un canguro y me llamo %s, salto %d metros y "
                         + "naci en %s: trust the plan! \n", getNombre(), salto, fechaNacimiento);
    }
}
